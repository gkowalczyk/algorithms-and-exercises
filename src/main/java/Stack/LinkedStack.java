package Stack;

import SinglyLinkedList.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E> {

    SinglyLinkedList<E> data = new SinglyLinkedList<E>();

    public LinkedStack() {
            }

    @Override
    public int size() {
        return data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void push(E element) {
     data.addFirst(element);
    }

    @Override
    public E top() {
        return data.front();
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }
}
