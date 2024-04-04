package lab11.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleNumbers {

    public static List<Integer> getDivisibleNumbers(List<Integer> numbers, int divisor) {
        List<Integer> divisibleNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % divisor == 0) {
                divisibleNumbers.add(number);
            }
        }
        return divisibleNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 15, 26, 72, 81, 93, 115);
        int divisor = 3;
        List<Integer> divisibleNumbers = getDivisibleNumbers(numbers, divisor);
        for (int number : divisibleNumbers) {
            System.out.println(number);
        }
    }
}

