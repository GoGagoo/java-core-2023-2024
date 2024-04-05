package lab13.refactor_examples;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            System.out.println("1");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}

/*
Пример 2 демонстрирует перехват исключения типа RuntimeException, но обработку выполняет перехватчик типа Exception, который является предком класса RuntimeException.
В данном примере, после вывода на консоль строки "0", генерируется новый объект исключения RuntimeException с сообщением "Непроверяемая ошибка" при помощи оператора throw.
Затем исключение перехватывается блоком try-catch. Но в данном случае используется блок catch для перехвата и обработки исключений типа Exception, а не RuntimeException.
Поскольку RuntimeException является подклассом Exception, то перехватчик типа Exception сможет перехватить и обработать это исключение. В блоке catch мы получаем доступ к объекту исключения при помощи переменной e и выводим на консоль строку "2" и информацию об исключении.
Далее, программа продолжает своё выполнение и выводит строку "3".
 */