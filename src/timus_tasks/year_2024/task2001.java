package timus_tasks.year_2024;

import java.util.Scanner;

public class task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int berries2 = b1 - b2;
        int berries1 = b3 - berries2 - b2;

        System.out.println(berries1 + " " + berries1);
    }
}
