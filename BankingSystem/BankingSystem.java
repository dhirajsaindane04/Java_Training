package BankingSystem;

abstract class BankAccount {
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public abstract void withdraw(double amount);

    // Check balance
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 500.0;

    public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= MINIMUM_BALANCE) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Withdrawal denied. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 1000.0;

    public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= -OVERDRAFT_LIMIT) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
            } else {
                System.out.println("Withdrawal denied. Overdraft limit of " + OVERDRAFT_LIMIT + " exceeded.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Savings Account
        SavingsAccount savings = new SavingsAccount("Alice", "S12345", 1000);
        System.out.println("Savings Account:");
        savings.checkBalance();
        savings.deposit(500);
        savings.withdraw(800);
        savings.withdraw(200);

        System.out.println();

        // Current Account
        CurrentAccount current = new CurrentAccount("Bob", "C67890", 2000);
        System.out.println("Current Account:");
        current.checkBalance();
        current.deposit(1000);
        current.withdraw(2500);
        current.withdraw(600);
    }
}
