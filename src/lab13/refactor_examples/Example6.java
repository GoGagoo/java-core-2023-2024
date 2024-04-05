package lab13.refactor_examples;

public class Example6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
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
Пример 6 демонстрирует неправильную последовательность перехвата исключений.
В этом примере блок try генерирует исключение типа NullPointerException с сообщением "ошибка". Однако, блоки catch расположены в неправильной последовательности.
Первым блоком catch является блок, который перехватывает исключение типа ArithmeticException. Этот блок не соответствует типу генерируемого исключения, поэтому он пропускается.
Вторым блоком catch является блок, который перехватывает исключение типа Exception. Этот блок также не соответствует типу генерируемого исключения, поэтому он также пропускается.
Третьим блоком catch является блок, который перехватывает исключение типа RuntimeException. Так как тип генерируемого исключения соответствует этому блоку, он должен был быть первым в цепочке перехвата исключений.
Из-за неправильной последовательности блоков catch компилятор выдает ошибку компиляции, которая сообщает о том, что некоторые блоки catch становятся недостижимыми. Это происходит потому, что предок (Exception) не должен перехватывать исключения раньше потомков (RuntimeException).
Чтобы исправить код, необходимо переместить блок catch для RuntimeException ниже блока catch для Exception, так как RuntimeException является подклассом Exception. И блок catch для ArithmeticException следует поместить перед блоком catch для Exception, так как ArithmeticException находится в иерархии классов между RuntimeException и Exception.
 */
