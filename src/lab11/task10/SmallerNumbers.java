package lab11.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallerNumbers {

    public static List<Integer> getSmallerNumbers(List<Integer> numbers, int maxValue) {
        List<Integer> smallerNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number < maxValue) {
                smallerNumbers.add(number);
            }
        }
        return smallerNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int maxValue = 6;
        List<Integer> smallerNumbers = getSmallerNumbers(numbers, maxValue);
        for (int number : smallerNumbers) {
            System.out.println(number);
        }
    }
}

