package com.example.algorithmsandexercises.Queue;

import java.util.EmptyStackException;

public class QueueJK <E>{


    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public QueueJK(){

    }

    public int size() {
        return size;}

    public boolean isEmpty(){return size==0;}

    public E front(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return head.getElement();
    }
    public E last(){
        if (isEmpty()) {
            throw new EmptyStackException();
        };
        return tail.getElement();
    }
    public void addFirst(E e){
        head = new Node<>(e, head); // tworzenie nowego wezla
        if (isEmpty())
            tail = head;
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if(isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst(){
        if(isEmpty())return null;
        E temp = head.getElement();
        head = head.getNext();
        size--;
        if(size==0)
            tail=null;
        return temp;
    }

//----------------------------------------------
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }

        public E getElement(){
            return element;
        }

        public void setNext(Node<E> n){
            next = n;
        }

        public Node<E> getNext(){
            return next;
        }
    }
    //-----------koniec klasy wezel-------------\
}


