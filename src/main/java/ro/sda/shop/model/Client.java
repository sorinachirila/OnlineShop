package ro.sda.shop.model;

public class Client {
    private boolean accout;
    private String userName;
    private int idClient;
    private String password;
    private String orders;

    public boolean isAccout() {
        return accout;
    }

    public void setAccout(boolean accout) {
        this.accout = accout;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public Client(boolean accout, String userName, int idClient, String password, String orders) {
        this.accout = accout;
        this.userName = userName;
        this.idClient = idClient;
        this.password = password;
        this.orders = orders;
    }
}
