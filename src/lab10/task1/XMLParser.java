package lab10.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javax.script.ScriptEngine.FILENAME;

public class XMLParser {

    private static final String FILE_NAME = "src/lab10/task1/example.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-".repeat(20) + "XML OPERATIONS" +"-".repeat(20));
            System.out.println("Выберите действие: ");
            System.out.println("1 - Просмотр списка книг");
            System.out.println("2 - Добавление новой книги");
            System.out.println("3 - Поиск книги по автору");
            System.out.println("4 - Поиск книги по году издания");
            System.out.println("5 - Удаление книги");
            System.out.println("0 - Выход");
            System.out.println("-".repeat(54));
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    addNewBook();
                    break;
                case 3:
                    searchBooksByAuthor();
                    break;
                case 4:
                    searchBooksByYear();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор, повторите попытку");
            }
        }
    }

    private static void displayBooks() {
        try {
            File inputFile = new File("src/lab10/task1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("*".repeat(50));
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println(".".repeat(50));
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Название книги: "
                            + element.getElementsByTagName("title").item(0)
                            .getTextContent());
                    System.out.println("Автор: "
                            + element.getElementsByTagName("author").item(0)
                            .getTextContent());
                    System.out.println("Год издания: "
                            + element.getElementsByTagName("year").item(0)
                            .getTextContent());
                }
            }
            System.out.println("*".repeat(50));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void addNewBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название книги:");
        String title = scanner.nextLine();

        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();

        System.out.println("Введите год издания книги:");
        int year = scanner.nextInt();

        try {
            File inputFile = new File("src/lab10/task1/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);


            Element rootElement = doc.getDocumentElement();

            // create new book element
            Element newBook = doc.createElement("book");

            // create title element and set its value
            Element titleElement = doc.createElement("title");
            titleElement.setTextContent(title);
            newBook.appendChild(titleElement);

            // create author element and set its value
            Element authorElement = doc.createElement("author");
            authorElement.setTextContent(author);
            newBook.appendChild(authorElement);

            // create year element and set its value
            Element yearElement = doc.createElement("year");
            yearElement.setTextContent(Integer.toString(year));
            newBook.appendChild(yearElement);

            // add the new book element to the root element
            rootElement.appendChild(newBook);

            // write the updated document back to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(inputFile);
            transformer.transform(source, result);

            System.out.println("Новая книга успешна добавлена!");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void searchBooksByAuthor() throws ParserConfigurationException, IOException, SAXException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите автора (Фамилия и Имя): ");
        String author = scanner.nextLine();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File(FILE_NAME));
        doc.getDocumentElement().normalize();

        NodeList books = doc.getElementsByTagName("book");
        List<Element> filteredBooks = new ArrayList<>();

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            if (book.getElementsByTagName("author").item(0).getTextContent().equalsIgnoreCase(author)) {
                filteredBooks.add(book);
            }
        }

        if (filteredBooks.size() == 0) {
            System.out.println("Не найдено книг автора " + author);
        } else {
            System.out.println("Книги автора " + author + ":");
            for (Element book : filteredBooks) {
                System.out.println("Название: " + book.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Автор: " + book.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("Год публикации: " + book.getElementsByTagName("year").item(0).getTextContent());
                System.out.println();
            }
        }
    }

    private static void searchBooksByYear() throws ParserConfigurationException, IOException, SAXException {
        System.out.print("Введите год публикации книги: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File(FILE_NAME));
        doc.getDocumentElement().normalize();
        NodeList books = doc.getElementsByTagName("book");
        List<Element> filteredBooks = new ArrayList<>();
        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            int bookYear = Integer.parseInt(book.getElementsByTagName("year").item(0).getTextContent());
            if (bookYear == year) {
                filteredBooks.add(book);
            }
        }
        if (filteredBooks.size() == 0) {
            System.out.println("Не найдено книг, опубликованных в " + year + " году");
        } else {
            System.out.println("Книги опубликованные в " + year + " году: ");
            for (Element book : filteredBooks) {
                String title = book.getElementsByTagName("title").item(0).getTextContent();
                String author = book.getElementsByTagName("author").item(0).getTextContent();
                System.out.println(title + ", автор " + author);
            }
        }
    }

    private static void deleteBook() throws ParserConfigurationException, IOException, SAXException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги, которую необходимо удалить:");
        String title = scanner.nextLine();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File(FILE_NAME));
        doc.getDocumentElement().normalize();

        NodeList books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            Node book = books.item(i);
            if (book.getNodeType() == Node.ELEMENT_NODE) {
                Element bookElement = (Element) book;
                String bookTitle = bookElement.getElementsByTagName("title").item(0).getTextContent();
                if (bookTitle.equals(title)) {
                    book.getParentNode().removeChild(book);
                    System.out.println("Книга " + title + " удалена.");
                    saveChanges(doc);
                    return;
                }
            }
        }
        System.out.println("Книга " + title + " не найдена.");
    }
    private static void saveChanges(Document document) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(FILENAME));
            transformer.transform(source, result);
            System.out.println("Сохранение изменений на " + FILENAME);
        } catch (TransformerException e) {
            System.out.println("Ошибка сохранения  " + FILENAME + ": " + e.getMessage());
        }
    }
}