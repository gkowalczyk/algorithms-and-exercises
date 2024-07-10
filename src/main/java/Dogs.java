class Dogs extends Animal {
    @Override
    public String makeSound() {
        return "hau";

    }


    public static void main(String[] args) {
    Animal animal = new Dogs();
        System.out.println(animal.makeSound());
    }
}