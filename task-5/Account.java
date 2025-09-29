import java.util.ArrayList;
import java.util.Scanner;

class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount + " | Balance: " + balance);
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: " + amount + " | Balance: " + balance);
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showTransactions() {
        System.out.println("\n--- Transaction History ---");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}
