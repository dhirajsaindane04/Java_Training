package BillingSystem;

import java.util.Scanner;

public class GroceryStoreBillingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueShopping = true;
        while (continueShopping) {
            System.out.println("----- New Customer -----");
            System.out.print("Enter customer's name: ");
            String customerName = scanner.nextLine();

            double totalBill = 0;
            boolean doneShopping = false;
            while (!doneShopping) {
                System.out.print("Enter the name of the item (or 'done' to finish): ");
                String itemName = scanner.nextLine();

                if (itemName.equalsIgnoreCase("done")) {
                    doneShopping = true;
                } else {
                    System.out.print("Enter the price of " + itemName + ": $");
                    double itemPrice = scanner.nextDouble();
                    System.out.print("Enter the quantity of " + itemName + ": ");
                    int itemQuantity = scanner.nextInt();
                    scanner.nextLine(); 

                    double itemTotal = itemPrice * itemQuantity;
                    totalBill += itemTotal;
                    System.out.println("Added " + itemQuantity + " of " + itemName + " to the bill. Total: $" + itemTotal);
                }
            }

            System.out.println("\n--- Customer Bill ---");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Total Bill: $" + totalBill);
            System.out.print("\nWould you like to process another customer? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                continueShopping = false; 
            }
        }

        System.out.println("\nThank you for using the Grocery Store Billing System!");

        scanner.close();
    }
}
