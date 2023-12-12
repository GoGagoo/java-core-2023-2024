package lab4;

import java.util.Random;

public class lab6 {

    public static void main(String[] args) {
        int rows = 5;
        int columns = 10;

        int[][] array = new int[rows][columns];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        int rowIndex = random.nextInt(rows);
        int columnIndex = random.nextInt(columns);

        int[][] newArray = new int[rows - 1][columns - 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i != rowIndex && j != columnIndex) {
                    newArray[i < rowIndex ? i : i - 1][j < columnIndex ? j : j - 1] = array[i][j];
                }
            }
        }

        System.out.println("Исходный массив:");
        for (int[] row : array) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        System.out.println("Преобразованный массив:");
        for (int[] row : newArray) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}













