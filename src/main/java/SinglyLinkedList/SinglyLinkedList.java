package SinglyLinkedList;

import java.util.Objects;

public class SinglyLinkedList<E> {

    public SinglyLinkedList() {
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E front() { //first element of list
        if(isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public E tail() { //last element of list
        return tail.getElement();
    }

    public void addFirst(E element) {
        head = new Node<>(element, head);
        if (size == 0) {
           tail = head;
        }
        size++;
    }

    public void addLast(E element) {
        Node<E> newest = new Node<>(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
            tail = newest;
            size++;
        }
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E temporary = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return temporary;
    }


    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }


        public E getElement() {
            return element;
        }

        //public void setElement(E element) {
        //     this.element = element;
        //  }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(element, node.element) && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(element, next);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
                    '}';
        }
    }
}
