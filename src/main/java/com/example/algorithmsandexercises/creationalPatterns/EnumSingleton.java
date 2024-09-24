package com.example.algorithmsandexercises.creationalPatterns;

//najlepsza prakyka tworzenia singletona w Java
public enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("EnumSingleton: Witaj w Singletonie!");
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.showMessage();
    }
}
