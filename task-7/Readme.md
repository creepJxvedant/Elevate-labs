#  Task 7: Java JDBC – Employee Database App

## Objective
Develop a **Java application** that connects to a **MySQL/PostgreSQL database** and performs **CRUD operations** using **JDBC**.

---

## ️ Tools & Setup
- Java (JDK 8+)
- Database: MySQL / PostgreSQL
- JDBC Driver (`mysql-connector-j` or `postgresql-connector-j`)
- IDE: VS Code / IntelliJ IDEA CE
- Terminal / Command Prompt

---

##  Features
- **Add Employee** (Insert into DB)
- **View Employees** (Retrieve and display)
- **Update Employee** (Modify details)
- **Delete Employee** (Remove from DB)

---

## ️ Database Setup

### MySQL Example
```sql
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE
);
```

### PostgreSQL Example
```sql
CREATE DATABASE employee_db;

CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE PRECISION
);
```

---

## Java Code Structure

### Main Class: `EmployeeApp.java`
```java
// Full JDBC EmployeeApp code here (Add, View, Update, Delete)
```
*(See provided code in implementation section above)*

---

## How to Run

1. **Compile**
```sh
javac EmployeeApp.java
```

2. **Run**
```sh
java EmployeeApp
```

⚠ Make sure MySQL/PostgreSQL server is running and JDBC driver `.jar` is added to classpath.

---

## Outcome
- Learned to use **JDBC for database connectivity**.
- Practiced **CRUD operations** with SQL.
- Understood how to use **Connection, PreparedStatement, and ResultSet**.
- Simulated a **real-world employee database system**.
