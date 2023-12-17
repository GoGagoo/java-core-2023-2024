package lab6;

public class Classlab3 {
    public static int max(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int min(int... numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double avg(int... numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
