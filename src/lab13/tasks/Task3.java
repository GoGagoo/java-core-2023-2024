package lab13.tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] arr = null;
        int sum = 0;
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            arr = new byte[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextByte();
                sum += arr[i];
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенная строка не может быть преобразована в число типа byte");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: попытка деления на ноль");
        }
        if (arr != null) {
            System.out.println("Сумма элементов массива: " + sum);
        }
    }
}
