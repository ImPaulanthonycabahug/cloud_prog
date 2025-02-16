import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class InventoryManagementSystem {
    private ArrayList<Product> products;

    public InventoryManagementSystem() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
        System.out.println("Product '" + name + "' has been added.");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products are available.");
        } else {
            System.out.println("Available Products:");
            for (Product product : products) {
                System.out.println("Name: " + product.getName() + ", Price: $" + product.getPrice());
            }
        }
    }
}

class InventoryManagementApp {
    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Inventory Management System - Developed by Paul Anthony Cabahug");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Product");
            System.out.println("2. Display Products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the product price: ");
                    double price = scanner.nextDouble();
                    inventorySystem.addProduct(name, price);
                    break;
                case 2:
                    inventorySystem.displayProducts();
                    break;
                case 3:
                    System.out.println("Thank you for using the Inventory Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}