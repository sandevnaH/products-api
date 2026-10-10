package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product(){}

    public Product(Long id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}

/*Jackson only includes a field if there is a matching
public getter. I removed getName(), so Jackson has
no way to read name, and it skips that field. The other
two still have getters, so they stay.
 */
