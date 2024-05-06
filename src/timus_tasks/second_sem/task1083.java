package timus_tasks.second_sem;

import java.util.Scanner;

public class task1083 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num = in.nextInt();
        String sem = in.next();

        int howMach = 0;

        char[] semToCh = sem.toCharArray();

        for (char c : semToCh) {
            howMach++;
        }

        int a = 1;

        for (int b = num; b > 0; b = b - howMach) {
            a = a * (num);
            num -= howMach;
        }
        System.out.println(a);
    }
}
