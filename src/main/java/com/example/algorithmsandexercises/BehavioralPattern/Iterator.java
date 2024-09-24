package com.example.algorithmsandexercises.BehavioralPattern;

import org.springframework.scheduling.annotation.Async;

import java.util.ArrayList;
import java.util.List;
//Wzorzec iterator
public interface Iterator {
    boolean hasNext();

    Object next();
}

interface Aggregate {
    Iterator createIterator();
}

class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();

    public void addItem(Object item) {
        items.add(item);
    }


    @Override
    public Iterator createIterator() {

        return new ConcreteIterator(items);
    }
}

    class ConcreteIterator implements Iterator {
        private List<Object> items;
        private int posiotion = 0;

        public ConcreteIterator(List<Object> items) {
            this.items = items;
        }
        @Async
        @Override
        public boolean hasNext() {
            return posiotion < items.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return items.get(posiotion++);
            }
            return null;
        }

        public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.addItem("item1");
        concreteAggregate.addItem("item2");

            Iterator iterator = concreteAggregate.createIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

