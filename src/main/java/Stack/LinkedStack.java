package Stack;

import SinglyLinkedList.SinglyLinkedList;
import org.springframework.beans.factory.annotation.Autowired;

public class LinkedStack<E> implements Stack<E> {
    @Override
    public String toString() {
        return "LinkedStack{" +
                "data=" + data +
                '}';
    }

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
        return data.firstElement();
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }
}
