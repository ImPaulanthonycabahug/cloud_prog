// Product.java
// Created by: Paul Anthony Cabahug

public class Product {
    private String name;
    private double price;


    public Product(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.name = name;
        this.price = price;
    }
    

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public String toString() {
        return String.format("Product Name: %s, Price: $%.2f", name, price);
    }
}
