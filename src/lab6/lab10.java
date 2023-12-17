package lab6;
import java.util.Arrays;

class MaxMin {
    public static int[] maxMin(int... numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 8};
        int[] result = maxMin(numbers);

        System.out.println(Arrays.toString(result));
    }
}

