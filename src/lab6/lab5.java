package lab6;

class SumOfSquares {
    public static int sumOfSquares(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(5));
        System.out.println(sumOfSquares(10));
    }
}
