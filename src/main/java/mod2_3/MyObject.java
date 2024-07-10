package mod2_3;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class MyObject {

    private final int value;

    public MyObject(int value) {
        this.value = value;
    }

    public int getIntValue() {
        return value;
    }

    public boolean equals(Object o) {
        MyObject myObject = (MyObject) o;
        if (myObject.getIntValue() == value) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "value=" + value +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public static void main(String[] args) {
        List<MyObject> list = new ArrayList<>();
        SecureRandom random = new SecureRandom();

        IntStream.generate(() -> 5)
                .limit(10)
                .forEach(n -> list.add(new MyObject(random.nextInt(10))));

        Iterator<MyObject> iterator = list.iterator();
        while (iterator.hasNext()) {
            MyObject myObject = iterator.next();
            for (int k = 0; k < list.size(); k++) {
                if (list.get(k).hashCode() != myObject.hashCode()) {

                    if (list.get(k).equals(myObject)) {
                        System.out.println("Duplicate found: " + myObject.getIntValue() + ", " + "hashcode:" + myObject.hashCode());
                    }
                }
            }
        }

    }
}
