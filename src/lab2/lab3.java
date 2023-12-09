package LAB2;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int myNum = scanner.nextInt();
		
		if (myNum % 4 == 0 && myNum >= 10) {
            System.out.println("Число удовлетворяет критериям");
        } else {
            System.out.println("Число не удовлетворяет критериям");
        }

	}

}
