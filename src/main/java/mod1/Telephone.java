package mod1;

public interface Telephone {
    void callTo(String name);

    default void callToMom() { //metoda która nie musi być wywołana  //
        System.out.println("Iam calling to mom");
    }
        static String getMyNumber() { // metoda statyczna w interfejsie
            return "1233456789";
        }


    class Mobile implements Telephone {

        @Override
        public void callTo(String name) {
            System.out.println("I am calling to" + name);
        }
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.callTo("Adam");
        mobile.callToMom();
        System.out.println(Telephone.getMyNumber()); //

    }
}
