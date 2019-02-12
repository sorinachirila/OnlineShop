package ro.sda.shop.presentation;

import ro.sda.shop.model.Product;
import ro.sda.shop.model.Stock;

import java.util.Scanner;

public class StockReader implements ConsoleReader<Stock> {

    public Stock read() {
        Stock stock = new Stock();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Product: ");
        ProductReader productReader = new ProductReader();
        Product product = productReader.read();
        System.out.println("Location: ");
        String location = scanner.nextLine();
        System.out.println("Quantity: ");
        Integer quantity = scanner.nextInt();
        stock.setProduct(product);
        stock.setLocation(location);
        stock.setQuantity(quantity);
        return stock;
    }
}
