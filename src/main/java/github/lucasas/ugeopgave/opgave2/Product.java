package github.lucasas.ugeopgave.opgave2;

import java.util.Arrays;

public class Product {
    private final String name;
    private final double price;
    private final String[] tags;

    public Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public void printInfo() {
        System.out.println("=== INFO ===");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Tags: " + Arrays.toString(tags));
        System.out.println("========");
    }

    public boolean hasTag(String tag) {
        return Arrays.asList(tags).contains(tag);
    }

    public double getPrice() {
        return price;
    }
}
