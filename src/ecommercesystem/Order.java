/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;

import java.util.*;

/**
 *
 * @author ELKARANK
 */
public class Order {

    private int customerId;
    private int orderId;
    private List<Product> products;
    private float totalPrice;

    public Order(int customerId, int orderId, List<Product> products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }

    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products: ");
        for (Product p : products) {
            System.out.println(p.get_name() + " - " + "$" + p.get_price());
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}
