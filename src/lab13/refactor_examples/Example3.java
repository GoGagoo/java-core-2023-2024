package lab13.refactor_examples;

public class Example3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}

/*
Пример 3 демонстрирует перехват исключения подходящим классом.
В этом примере блок try генерирует исключение типа RuntimeException с сообщением "ошибка". Затем исключение перехватывается блоками catch, которые проверяют тип исключения и выполняют соответствующий код в зависимости от типа.
Первым блоком catch является блок, который перехватывает исключение типа NullPointerException. Однако, тип генерируемого исключения (RuntimeException) не соответствует этому блоку, поэтому он пропускается.
Вторым блоком catch является блок, который перехватывает исключение типа RuntimeException. Так как тип генерируемого исключения соответствует этому блоку, он выполняется и выводит на консоль строку "2".
Третий блок catch является блоком, который перехватывает исключение типа Exception. Однако, так как уже было выполнено перехватывание исключения типа RuntimeException в предыдущем блоке catch, этот блок пропускается.
После блока try-catch программа выводит на консоль строку "4".
 */
