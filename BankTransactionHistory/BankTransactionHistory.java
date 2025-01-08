package BankTransactionHistory;

import java.util.Scanner;

public class BankTransactionHistory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000.00;
        int choice;

        System.out.println("Welcome to the Bank!");
        System.out.println("Your current balance is: $" + balance);
        do {
            System.out.println("\n--- Bank Transaction Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("You have successfully deposited: $" + depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("You have successfully withdrawn: $" + withdrawAmount);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;

                case 3: 
                    System.out.println("Thank you for using the bank. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }

            
            if (choice == 1 || choice == 2) {
                System.out.println("Your updated balance is: $" + balance);
            }

        } while (choice != 3); 

        scanner.close();
    }
}
