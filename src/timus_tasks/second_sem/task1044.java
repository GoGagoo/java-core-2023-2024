package timus_tasks.second_sem;

import java.util.Scanner;

public class task1044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt()/2;

        int[][] a = new int[n + 1][n*9 + 1];

        for (int b = 0; b <= n; b++) {
            a[b][0] = 1;
        }

        for (int c = 1; c <= n; c++) {
            for (int s = 1; s <= n*9; s++) {
                a[c][s] = 0;
                for (int i = 0; (i <= 9) && ((s - i) >= 0); i++) {
                    a[c][s] += a[c - 1][s - i];
                }
            }
        }

        int c = 0;
        for (int e = 0; e <= n*9; e++) {
            c += a[n][e]*a[n][e];
        }
        System.out.println(c);
        in.close();
    }
}
