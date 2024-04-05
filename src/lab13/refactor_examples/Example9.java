package lab13.refactor_examples;

public class Example9 {
    public static int ma() {
        try {
            System.out.println("0");
            return 55;    // выход из метода
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        System.out.println(ma());
    }
}
