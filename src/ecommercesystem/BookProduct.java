/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;

/**
 *
 * @author ELKARANK
 */
public class BookProduct extends Product {

    // Attributes
    private String author;
    private String publisher;

    // Constructor
    public BookProduct(int productid, String name, float price, String author, String publisher) {
        super(productid, name, price);
        this.author = author;
        this.publisher = publisher;
    }

    //set methods
    public void set_author(String author) {
        this.author = author;
    }

    public void set_publisher(String publisher) {
        this.publisher = publisher;
    }

    //get methods
    public String get_author() {
        return author;
    }

    public String get_publisher() {
        return publisher;
    }
}
