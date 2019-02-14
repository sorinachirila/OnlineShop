package ro.sda.shop.presentation;

import ro.sda.shop.model.*;
import ro.sda.shop.storage.ClientDAO;
import ro.sda.shop.storage.ProductDAO;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderReader implements ConsoleReader<Order> {
    ClientDAO clientDAO = new ClientDAO();
    ProductDAO productDAO = new ProductDAO();

    public Order read() {
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available clients ids:");
        for (Client client : clientDAO.findAll()) {
            System.out.println(client.getId() + " " + client.getName());
        }
        System.out.print("Please, select client, by id: ");
        Long clientId = scanner.nextLong();
        System.out.println("List of available products(ids and name): ");
        for (Product product : productDAO.findAll()) {
            System.out.println(product.getId() + " " + product.getName());
        }
        List<Product> productList = new ArrayList<>();
        System.out.println("Please, select the id: ");
        Long productId = scanner.nextLong();
        productList.add(productDAO.findById(productId));
        Double actualPrice = getActualPrice(productList);
        order.setClient(clientDAO.findById(clientId));
        order.setOrderedProducts(productList);
        order.setOrderStatus(OrderStatus.ACCEPTED);
        order.setActualPrice(actualPrice);
        order.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        return order;
    }

    private Double getActualPrice(List<Product> productList) {
        //System.out.print("Actual price: ");
        Double actualPrice = 0d;
        for (Product product : productList) {
            actualPrice += product.getPrice();
        }
        return actualPrice;
    }
/*
    private List<Product> getProducts(Scanner scanner) {
        System.out.print("Select product, by id? Type Y/N ");
        List<Product> productList = new ArrayList<>();
        String response = scanner.nextLine();
        while(response == "Y"){
            System.out.println("Please, select the id: ");
            Long productId = scanner.nextLong();
            productList.add(productDAO.findById(productId));
            System.out.print("Select product, by id? Type Y/N ");
            response = scanner.nextLine();
        }
        return productList;
    }*/

}
