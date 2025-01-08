package RestaurantMenuOrdering;

import java.util.Scanner;

public class RestaurantMenuOrdering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menuItems = {"Pizza", "Burger", "Pasta", "Salad", "Soda"};
        double[] itemPrices = {8.99, 5.99, 7.49, 4.50, 1.99};

        boolean continueOrdering = true;
        double totalCost = 0;
        StringBuilder orderDetails = new StringBuilder();

        System.out.println("Welcome to the Restaurant!");

        while (continueOrdering) {
            System.out.println("\n--- Menu ---");
            for (int i = 0; i < menuItems.length; i++) {
                System.out.println((i + 1) + ". " + menuItems[i] + " - $" + itemPrices[i]);
            }
            System.out.print("\nEnter the number of the item you want to order (1-" + menuItems.length + "): ");
            int itemChoice = scanner.nextInt();

            if (itemChoice >= 1 && itemChoice <= menuItems.length) {
                totalCost += itemPrices[itemChoice - 1];
                orderDetails.append(menuItems[itemChoice - 1]).append(" - $").append(itemPrices[itemChoice - 1]).append("\n");

                System.out.println("Added " + menuItems[itemChoice - 1] + " to your order. Price: $" + itemPrices[itemChoice - 1]);
            } else {
                System.out.println("Invalid choice. Please select a valid item number.");
            }
            System.out.print("\nWould you like to add another item to your order? (yes/no): ");
            scanner.nextLine(); 
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                continueOrdering = false; 
            }
        }

        System.out.println("\n--- Your Complete Order ---");
        System.out.println(orderDetails.toString());
        System.out.println("Total Cost: $" + totalCost);

        System.out.println("\nThank you for your order! Have a great day!");
        scanner.close();
    }
}
