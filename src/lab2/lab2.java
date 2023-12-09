package LAB2;

import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int myNum = scanner.nextInt();
		
		if (myNum % 5 == 2 && myNum % 7 == 1) {
            System.out.println("Число удовлетворяет критериям");
        } else {
            System.out.println("Число не удовлетворяет критериям");
        }

	}

}
