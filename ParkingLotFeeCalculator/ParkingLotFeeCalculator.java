package ParkingLotFeeCalculator;

import java.util.Scanner;

public class ParkingLotFeeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vehicles: ");
        int numVehicles = scanner.nextInt();
        for (int i = 0; i < numVehicles; i++) {
            System.out.print("Enter the number of hours parked for vehicle " + (i + 1) + ": ");
            int hoursParked = scanner.nextInt();
            double fee = 0;
            if (hoursParked <= 5) {
                fee = hoursParked * 2;
            } else {
                fee = 5 * 2 + (hoursParked - 5) * 1;
            }
            System.out.println("The parking fee for vehicle " + (i + 1) + " is: $" + fee);
            System.out.println(); 
        }
        scanner.close();
    }
}
