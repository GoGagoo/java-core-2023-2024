package lab4;
public class lab7 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        int[][] snakeArray = new int[rows][cols];

        int counter = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    snakeArray[i][j] = counter++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    snakeArray[i][j] = counter++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print
                        (snakeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
