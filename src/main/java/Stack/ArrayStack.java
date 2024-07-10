package Stack;

public class ArrayStack<E> implements Stack<E>{

    private static final int CAPACITY = 100;
    private E[] data;
    private int t = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[])new Object[capacity];

    }

    @Override
    public int size() {
        return t + 1;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public void push(E element) {// add element to the top of the stack
        if(size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = element;
    }

    @Override
    public E top() {// get the top element of the stack
       if(isEmpty()) return null;
       return data[t];
    }

    @Override
    public E pop() {  // remove and return the top element from the stack
        if (isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
}
