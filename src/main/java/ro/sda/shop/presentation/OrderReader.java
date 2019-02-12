package ro.sda.shop.presentation;

import ro.sda.shop.model.Client;
import ro.sda.shop.model.Order;
import ro.sda.shop.model.OrderStatus;
import ro.sda.shop.model.Product;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderReader implements ConsoleReader<Order> {

    public Order read() {
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Client: ");
        ClientReader clientReader = new ClientReader();
        Client client = clientReader.read();
        System.out.println("List of products: ");
        List<Product> listOfProducts = getProducts();
        System.out.println("Order status(accepted, placed, payed, delivered, canceled): ");
        String orderStat = scanner.nextLine().toUpperCase();
        System.out.print("Actual price: ");
        Double actualPrice = scanner.nextDouble();
        order.setClient(client);
        order.setOrderedProducts(listOfProducts);
        order.setOrderStatus(OrderStatus.valueOf(orderStat));
        order.setActualPrice(actualPrice);
        order.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        return order;
    }

    private List<Product> getProducts() {
        List<Product> listOfProducts = new ArrayList<Product>();
        ProductReader productReader = new ProductReader();
        Product product1 = productReader.read();
        Product product2 = productReader.read();
        listOfProducts.add(product1);
        listOfProducts.add(product2);
        return listOfProducts;
    }
}
