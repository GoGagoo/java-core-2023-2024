package lab3;

public class lab8 {
    public static void main(String[] args) {
        int n = 10;

        char[] array = new char[n];

        int i = 0;
        for (char ch = 'A'; i < n; ch++) {
            if (ch != 'A' && ch != 'E' && ch != 'I') {
                array[i++] = ch;
            }
        }

        System.out.println("Состав массива:");

        for (int j = 0; j < n; j++) {
            System.out.print(array[j] + " ");
        }
    }
}

