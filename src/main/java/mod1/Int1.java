package mod1;

public interface Int1 {

    public static final int a = 10; // zawsze pole jest public static final

    public abstract void display();// pole zawsze jest public abstract

    private static void method() {
        System.out.println("Static API");
    }

    default void show() {
        System.out.println("Default API");
    }

}

class Test implements Int1 {

    @Override
    public void display() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
        test.show();
        int result = Int1.a;
        System.out.println(result);
    }
}
