package timus_tasks.second_sem;
import java.util.Arrays;
import java.util.Scanner;

public class task1021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] n = new int[in.nextInt()];
        for (int a = 0; a < n.length; a++) {
            n[a] = in.nextInt();
        }

        int[] m = new int[in.nextInt()];
        for (int a = 0; a < m.length; a++) {
            m[a] = in.nextInt();
        }
        Arrays.sort(n);
        Arrays.sort(m);

        for (int i : n) {
            if (Arrays.binarySearch(m, 10000 - i) >= 0) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
