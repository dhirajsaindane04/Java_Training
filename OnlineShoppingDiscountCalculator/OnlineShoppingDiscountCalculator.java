package OnlineShoppingDiscountCalculator;

import java.util.Scanner;

public class OnlineShoppingDiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items in the cart: ");
        int numberOfItems = scanner.nextInt();
        double totalAmount = 0;
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Enter the price of item " + i + ": ");
            double price = scanner.nextDouble();
            totalAmount += price;
        }
        double discount = 0;
        if (totalAmount > 500) {
            discount = 0.10;
        } else if (totalAmount >= 200) {
            discount = 0.05;
        }
        double discountAmount = totalAmount * discount;
        double finalPrice = totalAmount - discountAmount;
        System.out.println("\nTotal amount: $" + totalAmount);
        System.out.println("Discount applied: $" + discountAmount);
        System.out.println("Final price after discount: $" + finalPrice);

        scanner.close();
    }
}
