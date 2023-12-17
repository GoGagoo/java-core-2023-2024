package lab6;

import java.util.Arrays;

class SwapElements {

    public static void swapElements(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};

        swapElements(array);

        System.out.println(Arrays.toString(array));
    }
}

