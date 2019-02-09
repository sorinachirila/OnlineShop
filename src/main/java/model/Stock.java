package model;

public class Stock {

    private int idStock;
    private Product produs;
    private int quantity;

    public Stock(int idStock, Product produs, int quantity) {
        this.idStock = idStock;
        this.produs = produs;
        this.quantity = quantity;
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public Product getProdus() {
        return produs;
    }

    public void setProdus(Product produs) {
        this.produs = produs;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
