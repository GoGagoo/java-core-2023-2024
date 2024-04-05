package lab12.task3;

public class Main {

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Четное число: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println("Нечетное число: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}

