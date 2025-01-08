package BankATMSimulation;

import java.util.Scanner;

// ATM.java
public class BankATM {
    private double balance;  // User's account balance

    public BankATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    // Method to deposit money
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". Your new balance is: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Your new balance is: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to calculate the electricity bill
    public void calculateElectricityBill(double unitsConsumed) {
        double rate = 0.12; // Assuming $0.12 per unit
        double billAmount = unitsConsumed * rate;
        System.out.println("Your electricity bill for " + unitsConsumed + " units is: $" + billAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ATM object with an initial balance of $500
        BankATM atm = new BankATM(500);

        boolean running = true;
        while (running) {
            // Display menu options
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Calculate Electricity Bill");
            System.out.println("5. Exit");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    atm.checkBalance();
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.depositMoney(depositAmount);
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdrawMoney(withdrawAmount);
                    break;

                case 4:
                    // Calculate electricity bill
                    System.out.print("Enter the number of units consumed: ");
                    double unitsConsumed = scanner.nextDouble();
                    atm.calculateElectricityBill(unitsConsumed);
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting the system. Thank you for using the ATM!");
                    running = false;
                    break;

                default:
                    // Invalid option
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

