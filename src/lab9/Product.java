package lab9;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void print() {
        System.out.println("Название: " + name);
        System.out.println("Количество: " + quantity);
        System.out.println("Цена: " + price);
    }

    public static void printProducts(List<Product> products) {
        if (!products.isEmpty()) {
            for (Product product : products) {
                product.print();
            }
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
                products.add(new Product("Молоко", 1, 50.0));
                products.add(new Product("Хлеб", 2, 30.0));
                products.add(new Product("Яблоки", 3, 100.0));

        printProducts(products);
    }
}
