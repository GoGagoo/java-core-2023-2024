package lab4;

import java.util.Random;

public class lab5 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;

        int[][] array = new int[rows][columns];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        int[][] newArray = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[j][i] = array[i][j];
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

















