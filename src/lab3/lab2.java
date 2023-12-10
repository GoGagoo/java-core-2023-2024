package lab3;
import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String weekDay = scanner.nextLine();

        switch (weekDay) {
            case "понедельник":
                System.out.println("Порядковый номер: 1");
                break;
            case "вторник":
                System.out.println("Порядковый номер: 2");
                break;
            case "среда":
                System.out.println("Порядковый номер: 3");
                break;
            case "четверг":
                System.out.println("Порядковый номер: 4");
                break;
            case "пятница":
                System.out.println("Порядковый номер: 5");
                break;
            case "суббота":
                System.out.println("Порядковый номер: 6");
                break;
            case "воскресенье":
                System.out.println("Порядковый номер: 7");
                break;
            default:
                System.out.println("Такого дня нет.");
        }
    }
}

