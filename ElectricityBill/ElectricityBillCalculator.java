package ElectricityBill;

import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of units consumed
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Initialize bill variable
        double billAmount = 0;

        // Calculate the bill based on the units consumed
        if (unitsConsumed >= 0 && unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1; // $1/unit for 0-100 units
        } else if (unitsConsumed >= 101 && unitsConsumed <= 200) {
            billAmount = (100 * 1) + ((unitsConsumed - 100) * 2); // $1/unit for first 100, $2/unit for 101-200 units
        } else if (unitsConsumed > 200) {
            billAmount = (100 * 1) + (100 * 2) + ((unitsConsumed - 200) * 3); // $1/unit for first 100, $2/unit for next 100, $3/unit for above 200
        } else {
            System.out.println("Invalid number of units. Please enter a positive value.");
            scanner.close();
            return; // Exit the program if invalid input is provided
        }

        // Display the calculated bill
        System.out.println("Your electricity bill for " + unitsConsumed + " units is: $" + billAmount);

        scanner.close();
    }
}
