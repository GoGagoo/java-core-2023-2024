package lab3;
import java.util.Scanner;

public class lab4 {

    // Версия с использованием цикла for

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            System.out.println(i);
        }
    }

// Версия с использованием цикла while

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int b = scanner.nextInt();
//
//        int i = Math.min(a, b);
//
//        while (i <= Math.max(a, b)) {
//            System.out.println(i);
//            i++;
//        }
//    }

// Версия с использованием цикла do...while

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//        int a = scanner.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int b = scanner.nextInt();
//
//        int i = Math.min(a, b);
//
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= Math.max(a, b));
//    }
}

