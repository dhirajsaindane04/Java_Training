package RestaurantOrderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuItem {
    private String itemName;
    private double itemPrice;
    private String itemCategory;

    public MenuItem(String itemName, double itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    @Override
    public String toString() {
        return itemName + " (" + itemCategory + ") - $" + itemPrice;
    }
}
class Restaurant {
    private List<MenuItem> menu;
    private List<MenuItem> customerOrder;

    public Restaurant() {
        menu = new ArrayList<>();
        customerOrder = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }
    }
    public void takeOrder() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter the item number to add to your order (0 to finish): ");
                int choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                } else if (choice > 0 && choice <= menu.size()) {
                    customerOrder.add(menu.get(choice - 1));
                    System.out.println(menu.get(choice - 1).getItemName() + " added to your order.");
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
            scanner.close();
        }
    }

    public void displayBill() {
        System.out.println("\nYour Order:");
        double total = 0.0;
        for (MenuItem item : customerOrder) {
            System.out.println(item);
            total += item.getItemPrice();
        }
        System.out.println("Total Bill: $" + total);
        System.out.println("Thank you for dining with us!");
    }
}

// Main.java
public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Adding menu items
        restaurant.addMenuItem(new MenuItem("Burger", 8.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Pasta", 12.49, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Salad", 6.99, "Starter"));
        restaurant.addMenuItem(new MenuItem("Soup", 5.49, "Starter"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 4.99, "Dessert"));
        restaurant.addMenuItem(new MenuItem("Cake", 5.99, "Dessert"));

        // Display the menu
        restaurant.displayMenu();

        // Take orders
        restaurant.takeOrder();

        // Display the bill
        restaurant.displayBill();
    }
}
