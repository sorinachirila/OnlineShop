package ro.sda.shop.presentation;


import ro.sda.shop.model.Product;
import ro.sda.shop.storage.ProductDAO;

import java.util.Scanner;

public class ProductMenu extends AbstractMenu {
    ProductDAO productDAO = new ProductDAO();
    ProductReader reader = new ProductReader();
    ProductWriter writer = new ProductWriter();

    protected void displayOptions() {
        System.out.println("1 - View all products");
        System.out.println("2 - View product details");
        System.out.println("3 - Edit product");
        System.out.println("4 - Add new product");
        System.out.println("5 - Delete product");
        System.out.println("0 - Exit");
    }


    protected void executeCmd(Integer option) {
        switch (option) {
            case 1:
                writer.writeAll(productDAO.findAll());
                break;
            case 2:
                System.out.println("Product details are: ");
                displayProductDetails();
                break;
            case 3:
                editPrice();
                break;
            case 4:
                Product newProduct = reader.read();
                productDAO.add(newProduct);
                break;
            case 5:
                System.out.println("Select product to delete: ");
                Long id = new Scanner(System.in).nextLong();
                productDAO.deleteById(id);
                break;
            case 0:
                System.out.println("Exiting to main menu");
                break;
            default:
                System.out.println("Invalid option");

        }
    }

    private void editPrice() {
        System.out.println("Select product to edit: ");
        Long id = new Scanner(System.in).nextLong();
        System.out.println("Enter new price: ");
        Double price = new Scanner(System.in).nextDouble();
        Product product = productDAO.findById(id);
        product.setPrice(price);
        productDAO.update(product);
    }

    private void displayProductDetails() {
            System.out.println("Choose product by id: ");
            Scanner scanner = new Scanner(System.in);
            Long id = scanner.nextLong();
            Product searchedProduct = productDAO.findById(id);
            writer.write(searchedProduct);
    }
}
