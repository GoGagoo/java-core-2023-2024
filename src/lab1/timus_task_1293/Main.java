package timus_task_1293;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int N = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int A = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int B = scanner.nextInt();

        int area = A * B;

        int amount = 2 * N * area;

        System.out.println("На обработку всех панелей «Энии» потребуется " + amount);
    }
}
