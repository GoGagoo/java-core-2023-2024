package lab6;

public class lab1 {
    public static void main(String[] args) {
        Classlab1 instance = new Classlab1();

        instance.setValue('a');
        instance.printValues();

        instance.setValue("Hello, wrld!");
        instance.printValues();

        char[] array = {'a', 'b', 'c'};
        instance.setValue(array);
        instance.printValues();
    }
}
