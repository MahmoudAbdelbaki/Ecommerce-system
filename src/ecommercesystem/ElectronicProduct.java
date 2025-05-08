package ecommercesystem;

public class ElectronicProduct extends Product {

    // Attributes
    private String brand;
    private int warrantyPeriod;

    // Constructor
    public ElectronicProduct(int productid, String name, float price, String brand, int warrantyPeriod) {
        super(productid, name, price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    //set methods
    public void set_brand(String brand) {
        this.brand = brand;
    }

    public void set_warrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    //get methods
    public String get_brand() {
        return brand;
    }

    public int get_warrantyPeriod() {
        return warrantyPeriod;
    }

}
