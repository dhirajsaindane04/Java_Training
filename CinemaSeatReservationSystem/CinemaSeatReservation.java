package CinemaSeatReservationSystem;

import java.util.Scanner;

public class CinemaSeatReservation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] seats = new String[5][10];
        
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = "Available";
            }
        }
        int choice;
        do {
            displaySeats(seats); 

            System.out.print("Enter the row number (1-5) to reserve: ");
            int row = scanner.nextInt() - 1;  
            System.out.print("Enter the column number (1-10) to reserve: ");
            int column = scanner.nextInt() - 1; 
            if (row >= 0 && row < 5 && column >= 0 && column < 10) {
                if (seats[row][column].equals("Available")) {
                    seats[row][column] = "Reserved";
                    System.out.println("Seat at row " + (row + 1) + ", column " + (column + 1) + " has been reserved.");
                } else {
                    System.out.println("Sorry, the selected seat is already reserved.");
                }
            } else {
                System.out.println("Invalid seat selection. Please choose a valid seat.");
            }
            System.out.print("Do you want to reserve another seat? (1 for Yes, 2 for No): ");
            choice = scanner.nextInt();

        } while (choice == 1); 

        System.out.println("Thank you for using the cinema seat reservation system!");
        scanner.close();
    }
    public static void displaySeats(String[][] seats) {
        System.out.println("\nCinema Seat Layout:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
