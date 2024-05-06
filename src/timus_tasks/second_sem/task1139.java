package timus_tasks.second_sem;

import java.util.Scanner;

public class task1139 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        String line = in.nextLine();
        String[] value = line.split( " " );

        int n = Integer.parseInt( value[0] );
        int m = Integer.parseInt( value[1] );
        int quarterX = ( n - 1 );
        int quarterY = ( m - 1 );
        int answer = quarterX + quarterY - HCF( quarterX, quarterY );
        System.out.println( answer );
    }

    public static int HCF( int a, int b ) {
        while ( b != 0 ) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
