package lab3;
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = scanner.nextInt();

        int a = 1;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}

