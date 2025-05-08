package ecommercesystem;

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
