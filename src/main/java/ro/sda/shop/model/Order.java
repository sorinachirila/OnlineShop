package ro.sda.shop.model;


import java.sql.Timestamp;
import java.util.List;

public class Order {
    private Long id;
    private Client client;
    private List<Product> orderedProducts;
    private Double actualPrice;
    private OrderStatus orderStatus;
    private Timestamp timestamp;

    public Order() {
    }
 /*   public Order(Integer id, Client client, List<Product> orderedProducts, Double actualPrice, OrderStatus orderStatus, Timestamp timestamp) {
        this.id = id;
        this.client = client;
        this.orderedProducts = orderedProducts;
        this.actualPrice = actualPrice;
        this.orderStatus = orderStatus;
        this.timestamp = timestamp;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public Double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
