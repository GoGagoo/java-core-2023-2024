package lab11.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringFinder {

    public static List<String> findSubstrings(List<String> strings, String substring) {
        List<String> foundStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.contains(substring)) {
                foundStrings.add(string);
            }
        }
        return foundStrings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world", "how", "are", "you", "bro");
        String substring = "o";
        List<String> foundStrings = findSubstrings(strings, substring);
        for (String string : foundStrings) {
            System.out.println(string);
        }
    }
}

