package ecommercesystem;

import java.util.*;

public class EcommerceSystem {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-Commerce System!");
        Scanner scanner = new Scanner(System.in);

        // Predefined products
        ElectronicProduct phone = new ElectronicProduct(1, "Smartphone", 599.9f, "Samsung", 1);
        ClothingProduct shirt = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
        BookProduct book = new BookProduct(3, "OOP", 39.99f, "O`Reilly", "X Publications");

        // Customer input
        System.out.print("Please enter your ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();   
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, address);

        // Cart and order process
        Cart cart = new Cart(customer.get_customerId());

        System.out.print("How many products do you want to add to your cart? ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Which product would you like to add?  1- Smartphone   2- T-Shirt   3- OOP");
            int choice = scanner.nextInt();
            if (choice == 1) {
                cart.addProduct(phone);
            } else if (choice == 2) {
                cart.addProduct(shirt);
            } else if (choice == 3) {
                cart.addProduct(book);
            } else {
                System.out.println("Invalid product");
            }
        }

        System.out.println("Would you like to place the order? 1- Yes 2- No");
        int confirm = scanner.nextInt();
        if (confirm == 1) {
            Order order = cart.placeOrder(1);
            order.printOrderInfo();
        } else {
            System.out.println("Order cancelled.");
        }

        scanner.close(); 
    }
}

