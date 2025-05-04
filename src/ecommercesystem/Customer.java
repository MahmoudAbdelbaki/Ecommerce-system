/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author ELKARANK
 */
public class Customer {

    // Attributes
    private int customerId;
    private String name;
    private String address;

    // Constructor
    public Customer(int customerId, String name, String address) {
        this.customerId = Math.abs(customerId);
        this.name = name;
        this.address = address;
    }

    //set methods
    public void set_customerId(int customerId) {
        this.customerId = customerId;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_address(String address) {
        this.address = address;
    }

    //get methods
    public int get_customerId() {
        return customerId;
    }

    public String get_name() {
        return name;
    }

    public String get_address() {
        return address;
    }

}
