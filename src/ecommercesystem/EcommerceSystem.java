/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author ELKARANK
 */
import java.util.*;

public class EcommerceSystem {

    public static void main(String[] args) {
        System.out.println("Welcome to the E-Commerce System!");
        Scanner scanner = new Scanner(System.in);

        //predefined products
        ElectronicProduct phone = new ElectronicProduct(1, "Smartphone", 599.9f, "Samsung", 1);
        ClothingProduct shirt = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
        BookProduct book = new BookProduct(3, "OOP", 39.99f, "O`Reilly", "X Publications");

        // customer input
        System.out.println("Please enter your ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, address);

        // Cart and order process
        Cart cart = new Cart(customer.get_customerId());

        System.out.println("How many products you want to add to your cart?");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Which product would you like to add?  1- Smartphone   2- T-Shirt   3- OOP");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    cart.addProduct(phone);
                    break;
                case 2:
                    cart.addProduct(shirt);
                    break;
                case 3:
                    cart.addProduct(book);
                    break;
                default:
                    System.out.println("Invalid product, skipping.");
                    break;
            }
        }

        System.out.println("Would you like to place the order? 1- Yes 2- No");
        int confirm;
        while (true) {
            try {
                confirm = scanner.nextInt();
                if (confirm == 1) {
                    Order order = cart.placeOrder(1);
                    order.printOrderInfo();
                } else {
                    System.out.println("Order cancelled.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number (1 or 2): ");
                scanner.next(); // clear invalid input
            }
        }
        scanner.close();
    }

}
