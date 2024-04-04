package lab11.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreaterNumbers {

    public static List<Integer> getGreaterNumbers(List<Integer> numbers, int minValue) {
        List<Integer> greaterNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number > minValue) {
                greaterNumbers.add(number);
            }
        }
        return greaterNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int minValue = 7;
        List<Integer> greaterNumbers = getGreaterNumbers(numbers, minValue);
        for (int number : greaterNumbers) {
            System.out.println(number);
        }
    }
}

