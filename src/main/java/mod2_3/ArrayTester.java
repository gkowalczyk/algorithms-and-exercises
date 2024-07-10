package mod2_3;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayTester {

    public void printEven(LinkedList<Integer> numbers) {
      numbers.stream()
              .filter(n -> n % 2 == 0)
              .forEach(System.out::println);
            }
        }
        class Run {
            public static void main(String[] args) {
                Random random = new Random();
                SecureRandom secureRandom = new SecureRandom();
                LinkedList<Integer> numbers = new LinkedList<>();
               IntStream.range(0, 100)
                        .forEach(n -> numbers.add(secureRandom.nextInt(100)));
                ArrayTester arrayTester = new ArrayTester();
                arrayTester.printEven(numbers);
            }
        }
