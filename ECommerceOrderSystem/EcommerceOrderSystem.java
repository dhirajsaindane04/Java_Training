package ECommerceOrderSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Item.java
class Item {
    private String itemName;
    private double price;
    private int quantity;

    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and toString method for displaying item details
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return itemName + " - " + "Price: $" + price + " x " + quantity;
    }
}

// Customer.java
class Customer {
    private String customerId;
    private String name;
    private String address;

    public Customer(String customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    // Getters and toString method for displaying customer details
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Address: " + address;
    }
}

// Order.java
class Order {
    private String orderId;
    private Date orderDate;
    private List<Item> orderedItems;

    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderedItems = new ArrayList<>();
    }

    // Method to add an item to the order
    public void addItem(Item item) {
        orderedItems.add(item);
    }

    // Method to calculate the total price of all ordered items
    public double calculateTotal() {
        double total = 0;
        for (Item item : orderedItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Ordered Items:");
        for (Item item : orderedItems) {
            System.out.println(item);
        }
        System.out.println("Total Order Price: $" + calculateTotal());
    }
}

// Main.java
public class EcommerceOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a customer
        Customer customer = new Customer("C1001", "John Doe", "123 Main Street, Cityville");

        // Create an order for the customer
        Order order = new Order("O2001", new Date());

        boolean ordering = true;
        while (ordering) {
            System.out.println("\nE-Commerce Order System:");
            System.out.println("1. Add an Item to the Order");
            System.out.println("2. View Order Details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Add item to the order
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double itemPrice = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int itemQuantity = scanner.nextInt();
                    Item item = new Item(itemName, itemPrice, itemQuantity);
                    order.addItem(item);
                    System.out.println("Item added to the order.");
                    break;

                case 2:
                    // Display order details
                    System.out.println("\nCustomer Details:");
                    System.out.println(customer);
                    order.displayOrderDetails();
                    break;

                case 3:
                    // Exit the system
                    System.out.println("Exiting the system. Thank you for your order!");
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

