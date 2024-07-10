package com.example.algorithmsandexercises.Queue;

public class QueueList<E> implements Queue<E>{

    QueueJK<E> data = new QueueJK<E>();

    public QueueList(){}

    public int size() {
        return data.size();}
    public boolean isEmpty() {
        return data.isEmpty();}
    public void enqueue(E e) {//dodawanie elementu na koniec kolejki
        data.addLast(e);}
    public E front() {
        return data.front();}
    public E dequeue() {//usuwanie i zwracane elementu na poczatku kolejki

        return data.removeFirst();}
}


