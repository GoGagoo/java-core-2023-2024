package lab11.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Squares {

    public static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squares = new ArrayList<>();
        for (int number : numbers) {
            squares.add(number * number);
        }
        return squares;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 8, 15);
        List<Integer> squares = getSquares(numbers);
        for (int square : squares) {
            System.out.println(square);
        }
    }
}

