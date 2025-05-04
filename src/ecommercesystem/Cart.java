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

public class Cart {

    // Attributes
    private int customerId;
    private List<Product> products;

    // Constructor
    public Cart(int customerId) {
        this.customerId = Math.abs(customerId);
        this.products = new ArrayList<>();
    }

    // Cart functions :
    // add product
    public void addProduct(Product p) {
        products.add(p);
    }

    // remove product
    public void removeProduct(Product p) {
        products.remove(p);
    }

    // calculate price
    public float calculatePrice() {
        float total = 0;
        for (Product p : products) {
            total += p.get_price();
        }
        return total;
    }

    // place Order
    public Order placeOrder(int orderId) {
        return new Order(customerId, orderId, new ArrayList<>(products), calculatePrice());
    }

    //get method for Array product(s)
    public List<Product> get_products() {
        return products;
    }

}
