package LibraryFineCalculation;

import java.util.Scanner;

public class LibraryFineCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();
        for (int i = 1; i <= numBooks; i++) {
            System.out.println("\nEnter details for Book " + i + ":");
            System.out.print("Enter the number of overdue days for book " + i + ": ");
            int overdueDays = scanner.nextInt();

            double fine = 0;
            if (overdueDays <= 7) {
                fine = overdueDays * 1.0;  
            } else {
                fine = (7 * 1.0) + ((overdueDays - 7) * 2.0); 
            }
            System.out.println("Total fine for Book " + i + " is: $" + fine);
        }

        scanner.close();
    }
}
