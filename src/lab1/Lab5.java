package lab1;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your the year of birth: ");
        int birthYear = scanner.nextInt();

        int currentYear  = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int age = currentYear - birthYear;

        System.out.println("Your age is " + age + " years.");
    }
}
