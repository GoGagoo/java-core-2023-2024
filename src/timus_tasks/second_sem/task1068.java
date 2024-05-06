package timus_tasks.second_sem;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = ((a<0)? (-1) : 1)*(a*(a+((a<2)? (-1) : 1))/2) + ((a<2) ? 1 : 0);
        out.println(b);
        out.flush();
    }
}
