package lab11.task1;

public class EvenNumbers {
    public static int[] getEvenNumbers(int[] numbers) {
        int[] evenNumbers = new int[0];
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers = addToArray(evenNumbers, number);
            }
        }
        return evenNumbers;
    }

    private static int[] addToArray(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = getEvenNumbers(numbers);
        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }
}
