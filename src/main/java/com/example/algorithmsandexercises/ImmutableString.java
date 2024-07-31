package com.example.algorithmsandexercises;

public class ImmutableString {


    public static void main(String[] args) {


        String str = new String("Hello World");
       String str2 =  str.replace("World", "Java");
       String str3 = new String(str);

        System.out.println(str);
        System.out.println(str3.replace("World", "Java"));

    }
}
