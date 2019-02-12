package ro.sda.shop.presentation;


public class MainMenu extends AbstractMenu {

    protected void displayOptions() {
        System.out.println("1 - Products");
        System.out.println("2 - Clients");
        System.out.println("3 - Orders");
        System.out.println("4 - Stocks");
        System.out.println("0 - Exit");

    }

    protected void executeCmd(Integer option) {
        switch (option) {
            case 1:
                System.out.println("Products menu");
                ProductMenu productMenu = new ProductMenu();
                productMenu.displayMenu();
                break;
            case 2:
                System.out.println("Clients menu");
                ClientMenu client = new ClientMenu();
                client.displayMenu();
                break;
            case 3:
                System.out.println("Orders menu");
                OrderMenu order = new OrderMenu();
                order.displayMenu();
                break;
            case 4:
                System.out.println("Stocks menu");
                StockMenu stock = new StockMenu();
                stock.displayMenu();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option");

        }
    }
}
