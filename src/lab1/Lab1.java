package lab1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your First Name: ");
        String fitstName = scanner.nextLine();

        System.out.println("Enter your First Name: ");
        String middleName = scanner.nextLine();

        System.out.println("Hello " + lastName + " " + fitstName + " " + middleName);
    }
}
