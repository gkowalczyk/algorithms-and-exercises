import java.util.Scanner;
//autor : Grzegorz Kowalczyk
public class ConvertToBinary {
    public static void main(String[] args) {

        int yourNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give your number:");
        yourNumber = scanner.nextInt();
        System.out.println("dec:");
        convertToBinary(yourNumber);
        System.out.println("\n");
        System.out.println("oct:");
        convertToOctal(yourNumber);
        System.out.println("\n");
        System.out.println("hex:");
        convertToHexaDecimal(yourNumber);
    }

    static void convertToBinary(int number) {
        int modulo = number % 2;
        if (number >= 2) {
            convertToBinary(number / 2);
        }
        System.out.print(modulo);
    }

    static void convertToOctal(int number) {
        int modulo = number % 8;
        if (number >= 8) {
            convertToOctal(number / 8);
        }
        System.out.print(modulo);
    }

    static void convertToHexaDecimal(int number) {
        int modulo = number % 16;
        if (number >= 16) {
            convertToOctal(number / 16);
        }
        System.out.print(modulo);
    }
}
