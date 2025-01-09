package ProductStockChecker;

import java.util.Scanner;

class Product {
    String name;
    int stock;
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    public boolean needsReorder(int threshold) {
        return stock < threshold;
    }
    public void displayProductInfo() {
        System.out.println("Product: " + name + " | Stock: " + stock);
    }
}
public class WarehouseStockChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int threshold = 10;
        Product[] products = {
            new Product("Product A", 5),
            new Product("Product B", 15),
            new Product("Product C", 8),
            new Product("Product D", 25)
        };

        System.out.println("Warehouse Stock Management System");
        System.out.println("--------------------------------");
        for (Product product : products) {
            product.displayProductInfo();
            if (product.needsReorder(threshold)) {
                System.out.println("Warning: " + product.name + " needs to be reordered.");
            } else {
                System.out.println(product.name + " is sufficiently stocked.");
            }

            System.out.println(); 
        }
        scanner.close();
    }
}
