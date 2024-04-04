package lab11.task9;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LettersOnly {

    public static List<String> getLettersOnlyStrings(List<String> strings) {
        List<String> lettersOnlyStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.matches("[a-zA-Z]+")) {
                lettersOnlyStrings.add(string);
            }
        }
        return lettersOnlyStrings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world123", "how", "are", "you", "bro1");
        List<String> lettersOnlyStrings = getLettersOnlyStrings(strings);
        for (String string : lettersOnlyStrings) {
            System.out.println(string);
        }
    }
}
