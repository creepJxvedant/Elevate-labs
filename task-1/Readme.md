# Java Console Calculator – Task 1

## Task Description
This project implements a **Java console-based calculator** capable of performing basic arithmetic operations: **addition, subtraction, multiplication, and division**. It demonstrates the use of Java methods, loops, and console input/output.

---

## What Was Done
- **Created methods** for each arithmetic operation (add, subtract, multiply, divide).  
- **Used `Scanner`** to read user input from the console.  
- **Implemented a loop** to allow continuous calculations until the user decides to exit.  
- **Handled divide-by-zero** gracefully by displaying an appropriate error message.  
- **Prepared interview questions** with answers covering fundamental Java concepts.

---

## Tools Used
- **Java (JDK)** – for compiling and running the program.  
- **VS Code or IntelliJ CE** – for development and code editing.  
- **Terminal / Command Prompt** – for executing the program.

---

## How to Run
1. Compile the program:
   ```bash
   javac Calculator.java
2. Run the program:
   ```bash
   java Calculator

---





---
---

# Interview Questions

This document contains commonly asked **Java interview questions** with answers, based on the calculator project.

---

## Questions & Answers

### 1. What is method overloading?
Method overloading is when multiple methods in the same class have the same name but different parameter lists (different number or type of arguments).

---

### 2. How do you handle divide-by-zero?
By checking if the denominator is zero before performing division and handling it gracefully (e.g., showing an error message).  
Example:
```java
if (b == 0) {
    System.out.println("Error: Division by zero is not allowed.");
}
```

---

### 3. Difference between `==` and `.equals()`?
- `==` compares **references** (memory addresses of objects).
- `.equals()` compares **content/values** of objects.

---

### 4. What are the basic data types in Java?
The primitive types are:
- `byte`
- `short`
- `int`
- `long`
- `float`
- `double`
- `char`
- `boolean`

---

### 5. How is Scanner used for input?
`Scanner` reads user input from the console.  
Example:
```java
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
```

---

### 6. Explain the role of a loop.
A loop executes a block of code repeatedly until a specified condition is met, enabling repetitive tasks without writing redundant code.

---

### 7. Difference between while and for loop?
- **for loop**: used when the number of iterations is known.  
- **while loop**: used when the condition is checked dynamically, and the number of iterations is unknown.

---

### 8. What is the JVM?
The **Java Virtual Machine (JVM)** executes Java bytecode and provides a runtime environment. It is responsible for making Java platform-independent.

---

### 9. How is Java platform-independent?
Java code is compiled into **bytecode**, which runs on the JVM. Since JVMs exist for multiple operating systems, the same code can run anywhere without modification.

---

### 10. How do you debug a Java program?
- Using **print statements** (e.g., `System.out.println`).
- Using an IDE debugger (breakpoints, step-by-step execution).
- Reading and analyzing **stack traces** when errors occur.

---
