package lab1;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        String age = scanner.nextLine();

        System.out.println("Your name is " + name + " and you " + age + " years old!");
    }
}
