package lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        int currentYear = LocalDate.now().getYear();

        int birthYear = currentYear - age;

        System.out.println("Your year of birth is " + birthYear + " years.");
    }
}
