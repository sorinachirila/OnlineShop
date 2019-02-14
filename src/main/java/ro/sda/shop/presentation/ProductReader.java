package ro.sda.shop.presentation;

import ro.sda.shop.model.Product;

import java.util.Scanner;

public class ProductReader implements ConsoleReader<Product> {
    public Product read() {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        readProductName(product, scanner);
        readProductDescription(product, scanner);
        System.out.println("Please, write product's price: ");
        Double price = scanner.nextDouble();
        product.setPrice(price);
        return product;
    }

    private void readProductDescription(Product product, Scanner scanner) {
        System.out.print("Please, write product's description(must start with upper letter):  ");
        String productDescription = scanner.nextLine();
        if(productDescription.matches("^[A-Z]{1}[a-z0-9]+")){
            product.setDescription(productDescription);
        }else{
            System.out.println("Invalid product description! Please provide correct description:");
        }
    }

    private void readProductName(Product product, Scanner scanner) {
        System.out.print("Please, write product name(must start with upper letter): ");
        String productName = scanner.nextLine();
        if(productName.matches("^[A-Z]{1}[a-z0-9]+$")){
            product.setName(productName);
        }else{
            System.out.println("Invalid product name! Please provide correct name:");
            productName = scanner.nextLine();
        }
    }
}
