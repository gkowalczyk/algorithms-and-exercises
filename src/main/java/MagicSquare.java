public class MagicSquare {

    public static void main(String[] args) {
        int[][] magicSquare = generateMagicSquare(3);
        printSquare(magicSquare);
    }

    public static int[][] generateMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];
        int row = size - 1;
        int column = size / 2;
        for (int num = 1; num < size * size; num++) {
            magicSquare[row][column] = num;
            row = (row + 1) % size;
            column = (column + 1) % size;
            System.out.println("row=" + row + "col=" + column);

            if (magicSquare[row][column] != 0) {
                row = (row - 1 + 3) % size;
                column = (column - 1 + 3) % size;
                row = (row - 1 + size) % size;
            }
        }
        return magicSquare;
    }

    public static void printSquare(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }
}