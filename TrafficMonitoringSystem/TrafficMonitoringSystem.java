package TrafficMonitoringSystem;

import java.util.Scanner;

public class TrafficMonitoringSystem {

    public static void main(String[] args) {
        int intervals = 12;
        int[] vehicleCounts = new int[intervals];
        int totalVehicles = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < intervals; i++) {
            System.out.print("Enter the number of vehicles passing through the toll gate in the " 
                             + (i + 1) + "th interval (5 minutes): ");
            vehicleCounts[i] = scanner.nextInt();
            totalVehicles += vehicleCounts[i];
        }
        double averageVehicles = (double) totalVehicles / intervals;
        System.out.println("\nTotal number of vehicles passing through the toll gate in an hour: " + totalVehicles);
        System.out.println("Average number of vehicles per 5-minute interval: " + averageVehicles);
        scanner.close();
    }
}
