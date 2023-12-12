package lab4;

public class lab3 {
    public static void main(String[] args) {
        int width = 5;
        int height = 10;

        int[][] array = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = 2;
            }
        }

        for (int[] row : array) {
            for (int item : row) {
                System.out.print(item);
            }
            System.out.println();
        }
    }
}
