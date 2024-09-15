//1)	Create a base class BankAccount with methods like deposit() and withdraw().
//  Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount.
//  \ Write a program that demonstrates the use of overridden methods and proper access modifiers & return the details


// Base class BankAccount
class BankAccount {
    private String owner;
    protected double balance;  // protected so that subclasses can access it

    // Constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to get account balance
    public double getBalance() {
        return balance;
    }

    // Method to get the account owner's name
    public String getOwner() {
        return owner;
    }
}

// Derived class SavingsAccount
class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public SavingsAccount(String owner, double balance, double withdrawalLimit) {
        super(owner, balance);  // calling the constructor of the superclass
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding the withdraw method to impose withdrawal limit
    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Cannot withdraw more than the limit of " + withdrawalLimit);
        } else if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to get the withdrawal limit
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
}

// Main class to test the functionality
public class Q1 {
    public static void main(String[] args) {
        // Create a general BankAccount
        BankAccount generalAccount = new BankAccount("Shrutika", 5000);
        System.out.println("Owner: " + generalAccount.getOwner());
        generalAccount.deposit(1000);
        generalAccount.withdraw(1500);
        System.out.println("Final Balance: " + generalAccount.getBalance());
        
        // Create a SavingsAccount with a withdrawal limit
        SavingsAccount savingsAccount = new SavingsAccount("Shruti", 5000, 1000);
        System.out.println("\nOwner: " + savingsAccount.getOwner());
        savingsAccount.deposit(500);
        savingsAccount.withdraw(2000);  // should trigger withdrawal limit
        savingsAccount.withdraw(800);   // valid withdrawal
        System.out.println("Final Balance: " + savingsAccount.getBalance());
    }
}



// PS D:\CoreJava\Assignment\Assignment5_lab> javac Q1.java
// PS D:\CoreJava\Assignment\Assignment5_lab> java Q1      
// Owner: Shrutika
// Deposited: 1000.0. New balance: 6000.0
// Withdrew: 1500.0. New balance: 4500.0
// Final Balance: 4500.0

// Owner: Shruti
// Deposited: 500.0. New balance: 5500.0
// Cannot withdraw more than the limit of 1000.0
// Withdrew: 800.0. New balance: 4700.0
// Final Balance: 4700.0
