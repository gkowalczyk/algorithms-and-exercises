package mod2_3;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Book {

    private String tittle;
    private String author;
    private int year;

    public Book(String tittle, String author, int year) {
        this.tittle = tittle;
        this.author = author;
        this.year = year;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
    public int hashCode() {
        return year * 100 + tittle.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        Book book = (Book) o;
        return year == book.year && Objects.equals(tittle, book.tittle) && Objects.equals(author, book.author);
    }
}

class Order {
    Book book;
    LocalDate localDate;

    public Order(Book book, int year, int month, int day) {
        this.book = book;
        this.localDate = LocalDate.of(year, month, day);
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "book=" + book +
                ", localDate=" + localDate +
                '}';
    }

}

class OrderService {
    public static void main(String[] args) {
        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray – lexicon for graphicians", "Dante Alighieri", 1572);
        Order theOrder1 = new Order(theBook1, 2017, 6, 28);
        Order theOrder2 = new Order(theBook2, 2017, 6, 28);
        Order theOrder3 = new Order(theBook1, 2017, 6, 29);
        Order theOrder4 = new Order(theBook2, 2017, 6, 30);
        Order theOrder5 = new Order(theBook3, 2017, 6, 30);

        Deque<Order> theOrders = new ArrayDeque<>();
        theOrders.offer(theOrder1);
        theOrders.offer(theOrder2);
        theOrders.offer(theOrder3);
        theOrders.offer(theOrder4);
        theOrders.offer(theOrder5);

        System.out.println("Check size:" + theOrders.size());

        System.out.println("First order FIFO: " + theOrders.peek());

        Order tempOrder;
        tempOrder = theOrders.poll();
        System.out.println("First order FIFO: " + tempOrder);
        theOrders.poll();
        theOrders.poll();
        theOrders.poll();
        theOrders.poll();
        System.out.println("Check size:" + theOrders.size());

    }
    }





