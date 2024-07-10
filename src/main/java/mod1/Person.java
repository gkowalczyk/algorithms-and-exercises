package mod1;

abstract class Person {

    private final String name;

    protected Person(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    abstract public void sayHello();
}

class Male extends Person {

    protected Male(String name) {
        super(name);
    }

    @Override
    public void sayHello() {

    }

    public static void main(String[] args) {
        Male male = new Male("John");
        String name = male.getName();
        System.out.println("Hello " + name);
        male.sayHello();
    }
}
