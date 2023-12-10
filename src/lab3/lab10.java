package lab3;
import java.util.Random;

public class lab10 {
    public static void main(String[] args) {
        int n = 10;

        int[] array = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив: ");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("\nМассив после сортировки:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

