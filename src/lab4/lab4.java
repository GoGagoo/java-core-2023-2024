package lab4;

public class lab4 {
    public static void main(String[] args) {
        int height = 10;

        int[][] array = new int[height][height];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = 1;
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
