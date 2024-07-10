package com.example.algorithmsandexercises.Queue;

public class QueueArray <E> implements QueueT<E> {

    private static final int CAPACITY = 100; // domyslny rozmiar kolejki
    private E[] array; // tablica przechowujaca elementy kolejki
    private int size; // rozmiar kolejki
    private int front; // indeks poczatku kolejki
    private int rear; // indeks konca kolejki

    // konstruktor kolejki
    public QueueArray() {
        array = (E[]) new Object[CAPACITY];
        size = 0;
        front = 0;
        rear = -1;
    }

    public int size() {
        return size;}
    public boolean isEmpty() {return size ==0;}
    public void enqueue(E e) throws IllegalStateException {// dodanie elementu na koniec kolejki
        if (size() == array.length) {
            throw new IllegalStateException("Kolejka jest pelna");
        }
        //rear = (rear + 1) % array.length; // obliczanie indeksu konca kolejki
        rear++;
       // rear = array.length - 1;
        array[rear] = e; // dodanie elementu e na koniec kolejki
        size++; // zwiekszenie rozmiaru kolejki
    }
    public E front() {
        if (isEmpty( )) return null;
        return array[front];
    }
    public E dequeue() { // usuwanie i zwracanie elementu na poczatku kolejki
        if (isEmpty( )) return null;
        E answer = array[front]; // przypisanie do zmiennej elementu na poczatku kolejki
        array[front] = null; // dereference to help garbage collection
        //front = (front + 1)% array.length; // obliczenie indeksu poczatku kolejki
        front++;
       // front = array.length - 1;
        size--; // zmniejszenie rozmiaru kolejki
        return answer; // zwrocenie zmiennej
    }
}

