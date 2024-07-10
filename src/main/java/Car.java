public class Car {
    private String brand;
    private String model;

    public Car(String toyota, String corolla) {
        this.brand = toyota;
        this.model = corolla;
    }

    // Konstruktor
    

    // Metoda dostępu do marki
    public String getBrand() {
        return brand;
    }

    // Metoda dostępu do modelu
    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
        // Tworzenie obiektu Car za pomocą konstruktora
        Car myCar = new Car("Toyota", "Corolla");

        // Uzyskanie danych o samochodzie za pomocą metod dostępowych
        System.out.println("Marka: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
    }
}
