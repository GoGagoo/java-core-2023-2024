package lab11.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalizedStrings {

    public static List<String> getCapitalizedStrings(List<String> strings) {
        List<String> capitalizedStrings = new ArrayList<>();
        for (String string : strings) {
            if (Character.isUpperCase(string.charAt(0))) {
                capitalizedStrings.add(string);
            }
        }
        return capitalizedStrings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world", "how", "are", "you", "Bro");
        List<String> capitalizedStrings = getCapitalizedStrings(strings);
        for (String string : capitalizedStrings) {
            System.out.println(string);
        }
    }
}

