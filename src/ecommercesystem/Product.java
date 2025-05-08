package ecommercesystem;

// this is a superclass
public class Product {

    // Attributes
    private int productid;
    private String name;
    private float price;

    // Constructor
    public Product(int productid, String name, float price) {
        this.productid = Math.abs(productid);
        this.name = name;
        this.price = Math.abs(price);
    }

    //set Methods   
    public void set_productid(int productid) {
        this.productid = Math.abs(productid);
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_price(float price) {
        this.price = Math.abs(price);
    }

    //get Methods
    public int get_productid() {
        return productid;
    }

    public String get_name() {
        return name;
    }

    public float get_price() {
        return price;
    }

}
