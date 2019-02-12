package ro.sda.shop.model;

public class Stock {

    private Long id;
    private Product product;
    private Integer quantity;
    private String location;

    public Stock() {
    }

/*    public Stock(Integer id, Product product, Integer quantity, String location) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.location = location;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
