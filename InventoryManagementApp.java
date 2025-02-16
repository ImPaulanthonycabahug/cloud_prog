// InventoryManagementApp.java
// Created by: Paul Anthony Cabahug

import java.util.Scanner;

public class InventoryManagementApp {
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

            if (!scanner.hasNextInt()) { // Validate input to prevent errors
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the product name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter the product price: ");
                    if (!scanner.hasNextDouble()) { // Validate price input
                        System.out.println("Invalid price. Please enter a valid number.");
                        scanner.next(); // Consume invalid input
                        continue;
                    }

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
