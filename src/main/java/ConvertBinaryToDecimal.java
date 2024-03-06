
import java.util.Scanner;
import java.util.stream.IntStream;

public class ConvertBinaryToDecimal {

    public static void main(String[] args) {

        int yourNumber;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give your number:");
        yourNumber = scanner.nextInt();
        System.out.print("dec:");
        int decimal = convertBinaryToDecimal(yourNumber, counter);
        System.out.print(decimal);
        System.out.print("\n");

        System.out.print("oct:");
        convertBinaryToOctal(yourNumber);
        System.out.print("\n");

        System.out.print("hex:");
        convertBinaryToHex(yourNumber);
    }

    public static int convertBinaryToDecimal(int number, int counter) {

        if (number == 0) {
            return 0;
        } else {
            int modulo = number % 10;
            number = number / 10;
            return (int) (modulo * Math.pow(2, counter) + convertBinaryToDecimal(number, counter + 1));
        }
    }

    public static void convertBinaryToOctal(int number) {
        int[] octalNumber = new int[number / 3];
        int counter = 0;

        while (number != 0) {
            int sumOfGroup = 0;
            for (int i = 0; i < 3; i++) {
                int modulo = number % 10;
                sumOfGroup = sumOfGroup + (int) (modulo * Math.pow(2, i));
                number = number / 10;
            }
            octalNumber[counter] = sumOfGroup;
            counter++;
        }
        IntStream.rangeClosed(0, counter -1)
                .boxed()
                .sorted((a, b) -> Integer.compare(b, a))
                .forEach(j -> System.out.print(octalNumber[j]));
        }

    public static void convertBinaryToHex(int number) {
        int[] hexNumber = new int[number / 3];
        int counter = 0;

        while (number != 0) {
            int sumOfGroup = 0;
            for (int i = 0; i < 4; i++) {
                int modulo = number % 10;
                sumOfGroup = sumOfGroup + (int) (modulo * Math.pow(2, i));
                number = number / 10;
            }
            hexNumber[counter] = sumOfGroup;
            counter++;
        }
        IntStream.rangeClosed(0, counter -1)
                .boxed()
                .sorted((a, b) -> Integer.compare(b, a))
                .forEach(j -> System.out.print(hexNumber[j]));

    }
}

