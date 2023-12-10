package lab3;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива чисел: ");
        int arrSize = scanner.nextInt();

        if (arrSize <= 0) {
            System.out.println("Некорректный размер массива.");
            return;
        }

        int[] array = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            array[i] = 2 + 5 * i;
        }

        for (int i = 0; i < arrSize; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

