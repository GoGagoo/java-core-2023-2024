package lab3;
import java.util.Scanner;

public class lab5 {

    // Версия с использованием цикла for

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в сумме: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;

                System.out.println(i);
            }
        }

        System.out.println("Сумма: " + sum);
    }

    // Версия с использованием цикла while

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество чисел в сумме: ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//        int i = 1;
//
//        while (i <= n) {
//            if (i % 5 == 2 || i % 3 == 1) {
//                sum += i;
//
//                System.out.println(i);
//            }
//            i++;
//        }
//
//        System.out.println("Сумма: " + sum);
//    }

//    Версия с использованием цикла do...while

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество чисел в сумме: ");
//        int n = scanner.nextInt();
//
//        int sum = 0;
//        int i = 1;
//
//        do {
//            if (i % 5 == 2 || i % 3 == 1) {
//                sum += i;
//
//                System.out.println(i);
//            }
//            i++;
//        }
//        while (i <= n);
//
//        System.out.println("Сумма: " + sum);
//    }
}

