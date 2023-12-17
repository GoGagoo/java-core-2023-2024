package lab6;

class lab4 {

    public static int doubleFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * doubleFactorial(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(doubleFactorial(3));
        System.out.println(doubleFactorial(6));
    }
}