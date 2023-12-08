package lab1;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter today's day of the week: ");
        String dayOfWeek = scanner.nextLine();

        System.out.println("What about month name?: ");
        String month = scanner.nextLine();

        System.out.println("Date (day number): ");
        int date = scanner.nextInt();

        System.out.println("Today " + dayOfWeek + " " + date + " " + month);
    }
}
