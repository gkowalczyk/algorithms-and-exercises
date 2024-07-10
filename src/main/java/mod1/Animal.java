package mod1;
//Ważne punkty w interfejsach Java
//W artykule dowiadujemy się o kilku ważnych kwestiach dotyczących interfejsów, jak wspomniano poniżej:
//
//Nie możemy utworzyć instancji (nie można utworzyć instancji interfejsu) interfejsu, ale możemy utworzyć do niego odniesienie, które będzie odnosić się do obiektu jego klasy implementującej.
//Klasa może implementować więcej niż jeden interfejs.
//Interfejs może rozciągać się na inny interfejs lub interfejs (więcej niż jeden interfejs).
//Klasa implementująca interfejs musi implementować wszystkie metody w interfejsie.
//Wszystkie metody są publiczne i abstrakcyjne. Wszystkie pola są publiczne, statyczne i ostateczne.
//Służy do osiągnięcia wielokrotnego dziedziczenia.
//Służy do uzyskania luźnego połączenia.
//Wewnątrz interfejsu nie można deklarować zmiennych instancji, ponieważ domyślnie zmienne są publicznymi, statycznymi i końcowymi.
//Wewnątrz interfejsu konstruktory nie są dozwolone.
//Wewnątrz interfejsu główna metoda nie jest dozwolona.
//Wewnątrz interfejsu deklaracja metod statycznych, końcowych i prywatnych nie jest możliwa.
public abstract interface Animal { // interface is abstract by default

    String voice();
    String name();
}

 class Dog implements Animal {

     @Override
     public String voice() {
         return "hauuu";
     }

     @Override
     public String name() {
         return "Dog";
     }
 }

     class AnimalRecognizer {
         public String recognize(Animal animal) {
           return "this is:" + animal.name() + "voice:" + animal.voice();

         }

     public static void main(String[] args) {
         AnimalRecognizer animalRecognizer = new AnimalRecognizer();
         String recognized = animalRecognizer.recognize(new Dog());
         System.out.println(recognized);

     }
 }