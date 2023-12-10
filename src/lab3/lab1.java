package lab3;
import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели (от 1 до 7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Сегодня понедельник");
                break;
            case 2:
                System.out.println("Сегодня вторник");
                break;
            case 3:
                System.out.println("Сегодня среда");
                break;
            case 4:
                System.out.println("Сегодня четверг");
                break;
            case 5:
                System.out.println("Сегодня пятница");
                break;
            case 6:
                System.out.println("Сегодня суббота");
                break;
            case 7:
                System.out.println("Сегодня воскресенье");
                break;
            default:
                System.out.println("Некорректное значение.");
        }
    }
}

