package lab6;

import java.util.Arrays;

class lab6 {

    public static int[] slice(int[] array, int n) {
        if (n > array.length) {
            return Arrays.copyOf(array, array.length);
        }

        return Arrays.copyOfRange(array, 0, n);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(slice(array, 5)));
        System.out.println(Arrays.toString(slice(array, 9)));
    }
}
