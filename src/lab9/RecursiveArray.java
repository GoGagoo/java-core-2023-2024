package lab9;

import java.util.Scanner;

public class RecursiveArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = readArraySize();
        int[] array = new int[size];

        readArray(array, 0);
        System.out.println("Введенный массив:");
        printArray(array, 0);
    }

    private static int readArraySize() {
        System.out.print("Введите размер массива: ");
        return scanner.nextInt();
    }

    private static void readArray(int[] array, int index) {
        if (index == array.length) {
            return;
        }

        System.out.printf("Введите элемент №%d: ", index + 1);
        array[index] = scanner.nextInt();
        readArray(array, index + 1);
    }

    private static void printArray(int[] array, int index) {
        if (index == array.length) {
            System.out.println();
            return;
        }

        System.out.print(array[index] + " ");
        printArray(array, index + 1);
    }
}