package lab1;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the month: ");
        String month = scanner.nextLine();

        System.out.println("Enter the number of days in this month: ");
        int days = scanner.nextInt();

        boolean isCorrect = false;
        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                if (days == 31) {
                    isCorrect = true;
                }
                break;
            case "February":
                if (days == 28 || days == 29) {
                    isCorrect = true;
                }
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                if (days == 30) {
                    isCorrect = true;
                }
                break;
        }

        if (isCorrect) {
            System.out.println("Month " + month + " contains " + days + " days.");
        } else {
            System.out.println("The number of days does not correspond to the number of days in the month " + month + ".");
        }
    }
}
