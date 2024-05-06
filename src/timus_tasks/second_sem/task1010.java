package timus_tasks.second_sem;
import java.util.Scanner;

public class task1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = 0;
        int p1 = 0;
        int p2 = 0;
        int N = in.nextInt();
        long prev = in.nextLong();

        for (int i = 2; i <= N; i++) {
            long current = in.nextLong();
            if (Math.abs(current - prev) > k) {
                k = Math.abs(current - prev);
                p1 = i - 1;
                p2 = i;
            }
            prev = current;
        }
        System.out.println(p1 + " " + p2);
    }
}
