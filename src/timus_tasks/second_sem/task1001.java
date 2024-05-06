package timus_tasks.second_sem;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class task1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] roots = new double[256*1000];
        int a = 0;
        while (in.hasNextLong()) {
            roots[a++] = sqrt(in.nextLong());
        }

        for (int b = a - 1; b >= 0; b--) {
            System.out.printf("%.4f\n", roots[b]);
        }
    }
}
