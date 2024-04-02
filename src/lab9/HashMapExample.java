package lab9;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Заполнение HashMap 10 объектами
        for (int i = 0; i < 10; i++) {
            map.put(i, "Строка " + i);
        }

        // Найти строки, у которых ключ > 5
        System.out.println("Строки, где ключ > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        // Вывести строки через запятую, если ключ = 0
        if (map.containsKey(0)) {
            System.out.println("Строки, где ключ = 0: " + map.get(0));
        }

        // Перемножить все ключи, где длина строки > 5
        int product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
            }
        }

        System.out.println("Произведение ключей, где длина строки > 5: " + product);
    }
}
