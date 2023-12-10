package lab3;
import java.util.Random;

public class lab9 {
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

        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        System.out.println("\nМинимальное значение: " + minValue);

        if (minIndex == 0) {
            System.out.println("Индекс: " + minIndex);
        } else {
            System.out.println("Индексы: " + minIndex);
        }
    }
}

