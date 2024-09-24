package com.example.algorithmsandexercises.creationalPatterns;

interface PrototypePattern extends Cloneable {
    PrototypePattern clone();

}

class PrototypePatternImpl implements PrototypePattern {
    private String name;

    public PrototypePatternImpl(String name) {
        this.name = name;
    }

    @Override
    public PrototypePattern clone() {
      return new PrototypePatternImpl(this.name);
    }

    @Override
    public String toString() {
        return "PrototypePatternImpl{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        PrototypePattern prototypePattern = new PrototypePatternImpl("PrototypePatternImpl");
        PrototypePattern clone = prototypePattern.clone();
        System.out.println(clone);
        System.out.println(clone == prototypePattern);// to nie ten sam obiekt bo nie jest referencja do tego samego obiektu
        System.out.println(clone.equals(prototypePattern));






    }
}
