package ro.sda.shop.model;


import java.sql.Timestamp;
import java.util.List;

public class Order {


    private int id;
    private Client client;
    private List<Product> orderproduct;
    private Double finalPrice;
    private enum orderStatus {placed, accepted, payed, delivered, canceld}
    private Timestamp timestamp;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getOrderproduct() {
        return orderproduct;
    }

    public void setOrderproduct(List<Product> orderproduct) {
        this.orderproduct = orderproduct;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}

