package ro.sda.shop.presentation;

import ro.sda.shop.model.Order;
import ro.sda.shop.model.Product;

import java.util.List;

public class OrderWriter implements ConsoleWriter<Order> {
    @Override
    public void write(Order order) {
        System.out.println("Id: " + order.getId());
        System.out.println("Client: " + order.getClient().getName());
        System.out.println("Products: ");
        ProductWriter productWriter = new ProductWriter();
        productWriter.writeAll(order.getOrderedProducts());
        System.out.println("Timestamp(date of order): " + order.getTimestamp());
    }

    public void writeAll(List<Order> orders) {
        if (orders.size() == 0) {
            System.out.println("No orders available.");
        } else {
            System.out.println("Orders list: ");
            for (Order order : orders) {
                writeSummary(order);
            }
        }
    }

    private void writeSummary(Order order) {
        System.out.print("Id: " + order.getId());
        System.out.print("  Client: " + order.getClient().getName());
        ProductWriter productWriter = new ProductWriter();
        System.out.print("  Products: ");
        productWriter.writeAll(order.getOrderedProducts());
        System.out.print("  Actual price: " + order.getActualPrice());
        System.out.print("  Order status: " + order.getOrderStatus());
        System.out.println(" Timestamp(date of order): " + order.getTimestamp());
    }


}
