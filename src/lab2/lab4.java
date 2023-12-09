package LAB2;

import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int myNum = scanner.nextInt();
		
		if (myNum >= 5 && myNum <= 10) {
            System.out.println("Число " + myNum + " попадает в диапазон от 5 до 10 включительно");
        } else {
            System.out.println("Число " + myNum + " не попадает в диапазон от 5 до 10 включительно");
        }

	}

}
