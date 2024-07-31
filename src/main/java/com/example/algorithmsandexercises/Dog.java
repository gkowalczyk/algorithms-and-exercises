package com.example.algorithmsandexercises;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Operator new tworzy instancję klasy, przydzielając pamięć nowemu obiektowi i zwracając odwołanie do tej pamięci. Operator new
// wywołuje także konstruktor klasy.
    class Dog implements Cloneable {
    String name;
    String breed;
    int age;
    String color;

    // Constructor Declaration of Class
    public Dog(String name, String breed, int age,
               String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public Dog() {

    }

    // method 1
    public String getName() {
        return name;
    }

    // method 2
    public String getBreed() {
        return breed;
    }

    // method 3
    public int getAge() {
        return age;
    }

    // method 4
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return ("Hi my name is " + this.getName()
                + ".\nMy breed,age and color are "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException {
        Dog tuffy
                = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
        
        Dog tuffy1 = (Dog)Class.forName("com.example.algorithmsandexercises.Dog").newInstance(); // zwraca nową instancja klasy Dog
        System.out.println(tuffy1);

        Dog tuffy2 = (Dog)tuffy.clone(); // przy pomocy klonowania
        System.out.println(tuffy2);

// Tworzenie objektów za pomocą serializacji
        FileInputStream fileInputStream = new FileInputStream("fileName.txt");// odczytywanie objektów z pliku
        ObjectInputStream obj = new ObjectInputStream(fileInputStream);
        Object obj1 = obj.readObject();
        System.out.println(obj1.toString());


        //Tworzenie objektów anonimowych których instancje są tworzone bezpośrednio w miejscu ich użycia

        //btn.setOnAction(new EventHandler()
        //{
        //    public void handle(zdarzenie ActionEvent)
        //    {
        //        System.out.println("Hello World!");
        //    }
        //});
    }
}
    //Inicializacja obiektu za pomocą metody lub funkcji

  class GFG {
      static String sw_name;
      static float sw_price;

      static void set(String n, float p) {
          sw_name = n;
          sw_price = p;
      }

      static void get() {
          System.out.println("Software name is: " + sw_name);
          System.out.println("Software price is: "
                  + sw_price);
      }

      public static void main(String[] args) {
          GFG.set("Tally", 20000);
          GFG.get();
      }
  }










