package ProductDiscountFinder;
import java.util.Scanner;

public class ProductDiscountFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter the price of product " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            
            System.out.print("Enter the discount percentage for product " + (i + 1) + ": ");
            double discountPercentage = scanner.nextDouble();
            double discountAmount = (price * discountPercentage) / 100;
            double discountedPrice = price - discountAmount;
            
            System.out.println("The discounted price for product " + (i + 1) + " is: $" + discountedPrice);
            System.out.println(); 
        scanner.close();
    }}
}
