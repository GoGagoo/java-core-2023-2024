package timus_tasks.second_sem;
import java.util.Scanner;

public class task1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] w = new int[n];

        for (int i = 0; i < n; i++)
            w[i] = in.nextInt();

        int diff = Integer.MAX_VALUE;
        for (int c = 0; c < 1 << n; c++) {
            int heap1Weight = 0;
            int heap2Weight = 0;
            int k = c;

            for (int i = 0; i < n; i++) {
                if ((k & 1) > 0)
                    heap1Weight += w[i];
                else
                    heap2Weight += w[i];
                    k >>= 1;
            }
            diff = Math.min(diff, Math.abs(heap1Weight - heap2Weight));
        }
        System.out.println(diff);
    }
}
