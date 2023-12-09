package LAB2;

import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите число:");
		int myNum = scanner.nextInt();
		
		int thousands = (myNum / 1000) % 10;
		
		if (thousands == 0) {
			System.out.println("Тысяч нет");
        } else if (thousands == 1) {
        	System.out.println("Одна тысяча");
        } else {
        	System.out.println(thousands + " тысяч");
        }

	}

}
