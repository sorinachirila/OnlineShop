package ro.sda.shop.presentation;

import ro.sda.shop.model.Product;

import java.util.List;

public class ProductWriter implements ConsoleWriter<Product> {
    public void write(Product product) {
        System.out.println("Id: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: " + product.getPrice());
    }
    public void writeAll(List<Product> products) {
        if (products.size() == 0) {
            System.out.println("No products available.");
        } else {
            System.out.println("Products list: ");
            for (Product product : products) {
                writeSummary(product);
            }
        }
    }

    private void writeSummary(Product product) {
        System.out.print("Id: " + product.getId());
        System.out.print(" Name: " + product.getName());
        System.out.print(" Description: " + product.getDescription());
        System.out.println(" Price: " + product.getPrice());
    }

}
