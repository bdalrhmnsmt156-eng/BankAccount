# 🏦 Bank Account Management System (Encapsulation)

A simple Java application that simulates a bank account system, demonstrating the core Object-Oriented Programming (OOP) concept of **Encapsulation**.

## 📌 Features & Constraints
- **Private Data Protection:** Account holder's `name` and `balance` are private to prevent direct external modification.
- **Controlled Deposits:** Deposits are only accepted if the amount is greater than zero ($> 0$).
- **Safe Withdrawals:** Withdrawals are only processed if the amount is positive ($> 0$) and sufficient balance exists.
- **Read-Only Access:** Balance can only be retrieved using the `getBalance()` getter method.

## 🛠️ Code Overview
- **Class:** `BankAccount`
- **Fields:** `private String name`, `private double balance`
- **Methods:** `deposit(double amount)`, `withdraw(double amount)`, `getBalance()`, `getName()`

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone [https://github.com/YOUR_USERNAME/BankAccount-Encapsulation.git](https://github.com/YOUR_USERNAME/BankAccount-Encapsulation.git)
