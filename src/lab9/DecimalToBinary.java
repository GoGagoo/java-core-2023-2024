package lab9;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите десятичное число: ");
        int decimalNumber = scanner.nextInt();

        String binaryString = decimalToBinary(decimalNumber);
        System.out.println("Двоичное представление: " + binaryString);
    }

    private static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        int remainder = decimalNumber % 2;
        return decimalToBinary(decimalNumber / 2) + remainder;
    }
}
