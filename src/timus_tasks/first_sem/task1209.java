package timus_tasks.first_sem;

import java.util.Scanner;

public class task1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (long i = 0; i < n; i++) {
            long x = in.nextInt() - 1;

            long y = (long) Math.sqrt(8 * x + 1);

            if (y * y == (8 * x + 1)) {
                System.out.println("1 ");
            } else {
                System.out.println("0 ");
            }
        }
    }
}
