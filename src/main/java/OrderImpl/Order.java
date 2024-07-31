package OrderImpl;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Order {

    private final String product;
    private final int amount;
    private final String size;

    public Order(String product, int amount, String size) {
        this.product = product;
        this.amount = amount;
        this.size = size;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", amount=" + amount +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        Order order = (Order) o;
        return amount == order.amount && Objects.equals(product, order.product) && Objects.equals(size, order.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, amount, size);
    }
}

    class OrderStorage {

        private Set<Order> orderSet = new HashSet<>();

        public OrderStorage() {

        }

        public Set<Order> getOrderSet() {
            return orderSet;
        }

        public void setOrderSet(Set<Order> orderSet) {
            this.orderSet = orderSet;
        }

        @Override
        public String toString() {
            return "OrderStorage{" +
                    "orderSet=" + orderSet +
                    '}';
        }

        public boolean addOrder(Order order) {
          return  orderSet.add(order);
        }

        public void removeOrder(Order order) {
            orderSet.remove(order);
        }
        public void printOrder() {
            orderSet.forEach(System.out::println);
        }



        public static void main(String[] args) {

            Order order1 = new Order("product1", 1, "size1");
            Order order2 = new Order("product2", 2, "size2");
            Order order3 = new Order("product3", 3, "size3");
            Order duplicatedOrder = new Order("product3", 3, "size3");
            Order newOrder = new Order("product4", 4, "size4");

            OrderStorage orderStorage = new OrderStorage();

            orderStorage.addOrder(order1);
            orderStorage.addOrder(order2);
            orderStorage.addOrder(order3);
            orderStorage.printOrder();

            orderStorage.addOrder(duplicatedOrder);

            orderStorage.printOrder();

            System.out.println(orderStorage.addOrder(duplicatedOrder)); // dzięki metodzie equals() i hashCode() nie dodaje duplikatów

            System.out.println(orderStorage.addOrder(newOrder)); // dodaje nowy obiekt kótry nie jest duplikatem

          /*  Order{product='product3', amount=3, size='size3'}
            Order{product='product1', amount=1, size='size1'}
            Order{product='product2', amount=2, size='size2'}
            Order{product='product3', amount=3, size='size3'}
            Order{product='product1', amount=1, size='size1'}
            Order{product='product2', amount=2, size='size2'}
            false
            true*/



        }
    }
