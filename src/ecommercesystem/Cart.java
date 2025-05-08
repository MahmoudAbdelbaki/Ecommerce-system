package ecommercesystem;

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
    private float calculatePrice() {
        float total = 0;
        for (Product p : products) {
            total += p.get_price();
        }
        return total;
    }

    public float getTotalPrice(){
        return calculatePrice();
    }

   // place Order
    public Order placeOrder(int orderId) {
        return new Order(customerId, orderId, new ArrayList<>(products), getTotalPrice());
    }

    //get method for Array product(s)
    public List<Product> get_products() {
        return new ArrayList<> (products); 
        // returns a copy to isure eencapsulation 
        // cart.get_products.clear() (RISK)
    }
    // note from div
    //
    // note: i used arraylist instead of a fixed array cause it has add and remove build_in functions 
    // and cause it is dynamic so you i don't have to resize the array or shift
    // the elements when i remove and i don't have to use int nProducts
    // and i used the interface (list<>) so i won't break encapsulation (am not sure if we took encapsulation or not)
}
