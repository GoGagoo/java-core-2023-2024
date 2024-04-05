package lab13.tasks;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Чтение размера массива
            System.out.print("Введите размер массива: ");
            int n = scanner.nextInt();

            // Создание массива
            int[] arr = new int[n];

            // Чтение элементов массива
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    sum += arr[i];
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Отсутствуют положительные элементы в массиве");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введенные данные не являются числом");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенные данные не являются числом");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: массив не был инициализирован");
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка: не были введены значения");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
