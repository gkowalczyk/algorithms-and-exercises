package com.example.algorithmsandexercises.structuralPattern;
//Wzorzec Proxy
interface Subject {
    void request();
}
 class RealSubject implements Subject {

     @Override
     public void request() {
         System.out.println("RealSubject: request");
     }
 }

 class Proxy implements Subject { // klasa przejmuje rolę
    private RealSubject realsubject;

     @Override
     public void request() {
         if(realsubject == null) {
             realsubject = new RealSubject();
         }
         System.out.println("Delegate request to RealSubject");
         realsubject.request();
     }

     public static void main(String[] args) {
         Subject subject = new Proxy();
            subject.request();
     }
 }