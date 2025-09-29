# Task 5: Bank Account Simulation

---

## Objective
Simulate basic **banking operations** in Java using **OOP principles** such as classes, encapsulation, and methods.

---

## Tools Used
- **Java (JDK)**
- **VS Code / IntelliJ CE**
- **Terminal / Command Prompt**

---

## Deliverables
A **class-based Java program** that performs deposits, withdrawals, balance checking, and transaction history tracking.

---

## Features
1. **Account Class**
    - Fields: `accountHolder`, `balance`, `transactions`
    - Methods:
        - `deposit(double amount)` → Add money to account.
        - `withdraw(double amount)` → Deduct money if balance allows.
        - `checkBalance()` → Show current balance.
        - `showTransactions()` → Display all transaction history.

2. **BankApp (Main Class)**
    - Provides **menu-driven CLI** for user interaction.
    - Options: Deposit, Withdraw, Check Balance, View Transactions, Exit.

---

## How to Run
1. Save the code in `BankApp.java`.
2. Compile the file:
   ```bash
   javac BankApp.java
   ```  
3. Run the program:
   ```bash
   java BankApp
   ```  
