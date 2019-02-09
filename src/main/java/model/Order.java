package model;


import java.util.List;

public class Order {
    private int orderNumber;
    private List<Product> orderproduct;
    private int finalPrice;
    private boolean isDelivered;
    private Client client;

    public Order(int orderNumber, List<Product> orderproduct, int finalPrice, boolean isDelivered, Client client) {
        this.orderNumber = orderNumber;
        this.orderproduct = orderproduct;
        this.finalPrice = finalPrice;
        this.isDelivered = isDelivered;
        this.client = client;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<Product> getOrderproduct() {
        return orderproduct;
    }

    public void setOrderproduct(List<Product> orderproduct) {
        this.orderproduct = orderproduct;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

