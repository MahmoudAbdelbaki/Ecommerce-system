
package ecommercesystem;

public class ClothingProduct extends Product {

    // Attributes
    private String size;
    private String fabric;

    // Constructor
    public ClothingProduct(int productid, String name, float price, String size, String fabric) {
        super(productid, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    //set methods
    public void set_size(String size) {
        this.size = size;
    }

    public void set_fabric(String fabric) {
        this.fabric = fabric;
    }

    //get methods
    public String get_size() {
        return size;
    }

    public String get_fabric() {
        return fabric;
    }

}
