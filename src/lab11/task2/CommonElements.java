package lab11.task2;

public class CommonElements {
    public static int[] getCommonElements(int[] numbers1, int[] numbers2) {
        int[] commonElements = new int[0];
        for (int number1 : numbers1) {
            for (int number2 : numbers2) {
                if (number1 == number2) {
                    commonElements = addToArray(commonElements, number1);
                }
            }
        }
        return commonElements;
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
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {3, 4, 5, 6, 7};
        int[] commonElements = getCommonElements(numbers1, numbers2);
        for (int number : commonElements) {
            System.out.println(number);
        }
    }
}

