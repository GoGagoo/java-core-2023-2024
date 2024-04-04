package lab10.task2;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("0. Показать список книг");
            System.out.println("1. Поиск книг по автору");
            System.out.println("2. Добавление новой книги");
            System.out.println("3. Удаление книги по названию");
            System.out.println("4. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    listbook();
                    break;
                case 1:
                    searchByAuthor();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }

            System.out.println();
        }
    }
    public static void listbook() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lab10/example2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void searchByAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя автора:");
        String author = scanner.nextLine();

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            Object booksObj = jsonObject.get("books");

            if (booksObj instanceof JSONArray) {
                JSONArray jsonArray = (JSONArray) booksObj;
                System.out.println("Результаты поиска для автора " + author + ":");
                boolean found = false;
                for (Object o : jsonArray) {
                    JSONObject book = (JSONObject) o;
                    if (book.get("author").equals(author)) {
                        System.out.println("Название книги: " + book.get("title"));
                        System.out.println("Год издания: " + book.get("year"));
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Книги данного автора не найдены.");
                }
            } else {
                System.out.println("Ошибка: структура данных некорректна.");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void addBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги: ");
            String title = scanner.nextLine();
            System.out.println("Введите автора книги: ");
            String author = scanner.nextLine();
            System.out.println("Введите год издания книги: ");
            int year = scanner.nextInt();

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            JSONObject newBook = new JSONObject();
            newBook.put("title", title);
            newBook.put("author", author);
            newBook.put("year", year);
            jsonArray.add(newBook);

            jsonObject.put("books", jsonArray);

            FileWriter fileWriter = new FileWriter("src/lab10/task2/example-json.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
            fileWriter.close();

            System.out.println("Книга успешно добавлена в массив.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeBook() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги, которую необходимо удалить: ");
            String title = scanner.nextLine();

            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/task2/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            boolean found = false;
            Iterator<Object> iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject book = (JSONObject) iterator.next();
                if (book.get("title").equals(title)) {
                    iterator.remove();
                    found = true;
                    break;
                }
            }

            if (found) {
                jsonObject.put("books", jsonArray);
                FileWriter fileWriter = new FileWriter("src/lab10/task2/example-json.json");
                fileWriter.write(jsonObject.toJSONString());
                fileWriter.flush();
                fileWriter.close();
                System.out.println("Книга успешно удалена из массива.");
            } else {
                System.out.println("Книга с таким названием не найдена.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}