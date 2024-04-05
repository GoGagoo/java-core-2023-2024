package timus_tasks.year_2024;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class task1910 {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus_tasks/input1910.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj  ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));

        PrintWriter out = new PrintWriter(System.out);

        int size = Integer.parseInt(bufferedReader.readLine());

        String[] strings = bufferedReader.readLine().split(" ");

        int[] intsAfter = new int[size - 2];

        for (int i = 0; i < intsAfter.length; i++) {
            intsAfter[i] = Integer.parseInt(strings[i]) +
                    Integer.parseInt(strings[i + 1]) +
                    Integer.parseInt(strings[i + 2]);
        }

        int[] ints = Arrays.copyOf(intsAfter, intsAfter.length);
        Arrays.sort(intsAfter);

        int firstValue = intsAfter[intsAfter.length - 1];

        for (int i = 0; i <intsAfter.length; i++) {
            if (ints[i] == firstValue) {
                out.println(firstValue + " " + (i + 2));
                break;
            }
        }
        out.flush();
    }
}
