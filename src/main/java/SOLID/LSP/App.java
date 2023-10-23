package SOLID.LSP;

public class App {

    public static void main(String[] args) {
////Zasada podstawienia Liskov (Liskov Substitution Principle, LSP) jest jednym z pięciu zasad SOLID w programowaniu obiektowym.
//// Zasada ta została sformułowana przez Barbare Liskov i głosi, że obiekt typu potomnego powinien być w pełni zastępowalny przez obiekt typu bazowego, zachowując spójność programu

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(2);
        System.out.println(rectangle.getArea());

        Rectangle rectangle1 = new Square();
        rectangle1.setWidth(5);
        rectangle1.setHeight(2);
        System.out.println(rectangle1.getArea());

        //W tym przypadku, klasa Square jest podtypem klasy Rectangle. Problemem jest to, że zmieniając szerokość i wysokość prostokąta, można uzyskać niewłaściwe wyniki
// w przypadku kwadratu (np. wysokość i szerokość kwadratu będą różne). To narusza oczekiwane zachowanie klasy bazowej i prowadzi do niespójności.


    }
}
