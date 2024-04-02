package lab9;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void print() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
    }

    public static void printBooks(List<Book> books) {
        if (!books.isEmpty()) {
            for (Book book : books) {
                book.print();
            }
        }
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Война и мир", "Лев Толстой", 1869));
        books.add(new Book("Преступление и наказание", "Фёдор Достоевский", 1866));
        books.add(new Book("Мастер и Маргарита", "Михаил Булгаков", 1940));

        printBooks(books);
    }
}
