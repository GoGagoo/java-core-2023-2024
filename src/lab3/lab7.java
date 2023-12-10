package lab3;
import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        int n = 10;

        char[] array = new char[n];

        for (int i = 0; i < n; i++) {
            array[i] = (char) ('а' + i);
        }

        System.out.println("Прямой порядок:");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nОбратный порядок:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

