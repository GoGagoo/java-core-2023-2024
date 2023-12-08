package lab1;

import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = scanner.nextInt();

        int incrementNum = num + 1;
        int decrementNum = num - 1;
        int squareNum = num * num;

        System.out.println("Output: " + num +
                ", " + incrementNum +
                ", " + decrementNum +
                ", " + squareNum);
    }
}
