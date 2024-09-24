package com.example.algorithmsandexercises;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InitializationOfObjectJava implements Cloneable{

    private final String name;
    private final String breed;
    private final int age;
    private final String color;

    static String name1 = "Burek";
    static String breed1 = "Owczareek";




    public InitializationOfObjectJava(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }



    static void set(String name, String breed) {
        name1 = name;
        breed1 = breed;
    }
    static void get() {
        System.out.println("Name: " + name1 + " Breed: " + breed1);
    }





    @Override
    public String toString() {
        return "InitializationOfObjectJava{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }



    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException {
        InitializationOfObjectJava dog = new InitializationOfObjectJava("Burek", "Owczarek", 5, "black");// pierwszy sposób inicjalizacji obiektu
        System.out.println(dog.toString());

        InitializationOfObjectJava.set("Burek", "Owczarek");// drugi sposób inicjalizacji obiektu
        InitializationOfObjectJava.get();

        //InitializationOfObjectJava dog1 = (InitializationOfObjectJava) Class.forName("com.example.algorithmsandexercises.InitializationOfObjectJava").newInstance();// trzeci sposób inicjalizacji obiektu
        //System.out.println(dog1.toString());

        InitializationOfObjectJava dog2 = (InitializationOfObjectJava) dog.clone();// czwarty sposób inicjalizacji obiektu
        System.out.println(dog2.toString());


        FileInputStream fileInputStream = new FileInputStream("fileName.txt");// piąty sposób inicjalizacji obiektu
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        Object object = in.readObject();
        System.out.println(object.toString());

    }
}


