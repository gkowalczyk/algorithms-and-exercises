import java.util.Scanner;

class square {
   private int sideLength;


    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public square(int sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return  Math.pow(sideLength,2);
    }
}


public class Algorithm {

    public static void main(String[] args) {
        /*int x = 0;
        System.out.println("Podaj imię: ");
        Scanner input = new Scanner(System.in);
        String imię = input.nextLine();
        System.out.println("Wynik: " + imię);
              x = input.nextInt();
        System.out.println(x/2);
        System.out.println(x + 3 );*/

        int[] value = new int[5];

        value[0] = 10;
        value[1] = 10;
        value[2] = 10;
        value[3] = 10;
        value[4] = 10;

        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum = sum + value[i];
        }
        System.out.println("sum=" + sum);
        double average = sum/ (double)value.length;
        System.out.println("average result=" + average);


        square square = new square(3);
        System.out.println(square.getArea());
        System.out.println(square.getSideLength());
     square.setSideLength(5);
        System.out.println(square.getSideLength());
    }
}
