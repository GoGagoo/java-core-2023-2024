package LAB2;

import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите число");
		int myNum = scanner.nextInt();
		
		if (myNum % 3 == 0) {
			System.out.println("Число " + myNum + " делится на 3 без остатков");
		} else {
			System.out.println("Число " + myNum + " НЕ делится на 3");
		}
	}

}
