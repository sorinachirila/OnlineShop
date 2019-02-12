package ro.sda.shop.presentation;

import ro.sda.shop.model.Order;
import ro.sda.shop.storage.OrderDAO;

import java.util.Scanner;

public class OrderMenu extends AbstractMenu {
    OrderDAO orderDAO = new OrderDAO();
    OrderReader reader = new OrderReader();
    OrderWriter writer = new OrderWriter();

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
                writer.writeAll(orderDAO.findAll());
                break;
            case 2:
                displayOrderDetails();
                break;
            case 3:
                editActualPrice();
                break;
            case 4:
                Order newOrder = reader.read();
                orderDAO.add(newOrder);
                break;
            case 5:
                System.out.println("Select order, by id, to delete: ");
                Long id = new Scanner(System.in).nextLong();
                orderDAO.deleteById(id);
                break;
            case 0:
                System.out.println("Exiting to main menu");
                break;
            default:
                System.out.println("Invalid option");

        }
    }

    private void editActualPrice() {
        System.out.println("Select order, by id, to edit: ");
        Long id = new Scanner(System.in).nextLong();
        System.out.println("Enter new actual price: ");
        Double actualPrice = new Scanner(System.in).nextDouble();
        Order order = orderDAO.findById(id);
        order.setActualPrice(actualPrice);
        orderDAO.update(order);
    }

    private void displayOrderDetails() {
        System.out.println("Choose order, by id: ");
        Scanner scanner = new Scanner(System.in);
        Long id = scanner.nextLong();
        Order searchedOrder = orderDAO.findById(id);
        writer.write(searchedOrder);
    }
}
