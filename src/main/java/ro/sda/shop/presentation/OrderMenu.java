package ro.sda.shop.presentation;

public class OrderMenu extends AbstractMenu {
    protected void displayOptions() {
        System.out.println("1 - View all orders");
        System.out.println("2 - View order details");
        System.out.println("3 - Edit order");
        System.out.println("4 - Add new order");
        System.out.println("5 - Delete order");
        System.out.println("0 - Exit");
    }

    protected void executeCmd(Integer option) {
        switch (option) {
            case 1:
                System.out.println("List of orders");
                break;
            case 2:
                System.out.println("Order details are: ");
                break;
            case 3:
                System.out.println("Edit order");
                break;
            case 4:
                System.out.println("Add a new order here: ");
                break;
            case 5:
                System.out.println("Select order to delete: ");
                break;
            case 0:
                System.out.println("Exiting to main menu");
                break;
            default:
                System.out.println("Invalid option");

        }
    }
}
