package ro.sda.shop.presentation;


public class ProductMenu extends AbstractMenu {

    protected void displayOptions() {
        System.out.println("1 - View all products");
        System.out.println("2 - View product details");
        System.out.println("3 - Edit product");
        System.out.println("4 - Add new product");
        System.out.println("5 - Delete product");
        System.out.println("0 - Exit");
    }


    protected void executeCmd(Integer option) {
        switch (option) {
            case 1:
                System.out.println("List of products");
                break;
            case 2:
                System.out.println("Product details are: ");
                break;
            case 3:
                System.out.println("Edit product");
                break;
            case 4:
                System.out.println("Add a new product here: ");
                break;
            case 5:
                System.out.println("Select product to delete: ");
                break;
            case 0:
                System.out.println("Exiting to main menu");
                break;
            default:
                System.out.println("Invalid option");

        }
    }
}
