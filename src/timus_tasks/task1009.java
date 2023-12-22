package timus_tasks;

import java.util.ArrayList;
import java.util.List;

public class task1009 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
