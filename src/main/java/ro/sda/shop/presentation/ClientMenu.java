package ro.sda.shop.presentation;

import ro.sda.shop.model.Client;

public class ClientMenu extends AbstractMenu {
    protected void displayOptions() {
        System.out.println("1 - View all clients");
        System.out.println("2 - View client details");
        System.out.println("3 - Edit client");
        System.out.println("4 - Add new client");
        System.out.println("5 - Delete client");
        System.out.println("0 - Exit");
    }

    protected void executeCmd(Integer option) {
        switch (option) {
            case 1:
                System.out.println("List of clients");
                break;
            case 2:
                System.out.println("Clients details are: ");
                break;
            case 3:
                System.out.println("Edit client");
                break;
            case 4:
                ClientReader reader = new ClientReader();
                ClientWriter writer = new ClientWriter();
                Client client = reader.read();
                writer.write(client);
                break;
            case 5:
                System.out.println("Select client to delete: ");
                break;
            case 0:
                System.out.println("Exiting to main menu");
                break;
            default:
                System.out.println("Invalid option");

        }
    }
}