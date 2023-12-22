package timus_tasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n = in.nextInt();

        int result = (m * n) % 2;

        out.println((result != 0) ? ("[second]=:]") : ("[:=[first]"));
        out.flush();
    }
}
