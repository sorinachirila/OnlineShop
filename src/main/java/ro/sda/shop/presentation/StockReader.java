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
        readStockLocation(stock, scanner);
        System.out.println("Quantity: ");
        Integer quantity = scanner.nextInt();
        stock.setProduct(product);
        stock.setQuantity(quantity);
        return stock;
    }

    private void readStockLocation(Stock stock, Scanner scanner) {
        System.out.println("Please, write stock's location (must start with upper letter): ");
        String location = scanner.nextLine();
        if(location.matches("^[A-Z]{1}[a-z0-9]+")){
            stock.setLocation(location);
        }else{
            System.out.println("Invalid location! Please provide correct location:");
        }
    }
}
