package ro.sda.shop.presentation;

import ro.sda.shop.model.Product;

import java.util.Scanner;

public class ProductReader implements ConsoleReader<Product> {
    public Product read() {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.println("Price: ");
        Double price = scanner.nextDouble();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        return product;
    }
}
