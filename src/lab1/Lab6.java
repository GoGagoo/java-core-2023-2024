package lab1;
import java.time.LocalDate;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your the year of birth: ");
        int birthYear = scanner.nextInt();

        int currentYear  = LocalDate.now().getYear();
        int age = currentYear - birthYear;

        System.out.println("Your name is " + name + " and your age is " + age + " years.");
    }
}
