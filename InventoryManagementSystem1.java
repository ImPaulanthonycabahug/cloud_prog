package cloud.p2exam;

import java.util.ArrayList;

public class InventoryManagementSystem1 {
    private ArrayList<Product> products;

    public InventoryManagementSystem1() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Product name cannot be empty.");
            return;
        }
        if (price < 0) {
            System.out.println("Error: Price cannot be negative.");
            return;
        }

        Product newProduct = new Product(name, price);
        products.add(newProduct);
        System.out.printf("Product added: %s ($%.2f)%n", name, price);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("\nProduct List:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
