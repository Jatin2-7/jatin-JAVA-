/*Q5. Develop a Java program to create a class Bank that maintains two
kinds of account for its customers, one called savings account and the
other current account. The savings account provides compound interest
and withdrawal facilities but no cheque book facility. The current
account provides cheque book facility but no interest. Current account
holders should also maintain a minimum balance and if the balance falls
below this level, a service charge is imposed. Create a class Account
that stores customer name, account number and type of account. From
this derive the classes Cur-acct and Sav-acct to make them more specific
to their requirements. Include the necessary methods in order to
achieve the following tasks: a) Accept deposit from customer and
update the balance. b) Display the balance. c) Compute and deposit
interest d) Permit withdrawal and update the balance Check for the
minimum balance, impose penalty if necessary and update the balance.*/

import java.util.Scanner;
class Account {
String customerName;
int accountNumber;
String accountType;
double balance;
Account(String name, int accNo, String accType, double initialBalance) {
customerName = name;
accountNumber = accNo;
accountType = accType;
balance = initialBalance;
}
void deposit(double amount) {
balance += amount;
System.out.println("Deposit of $" + amount + " successful.");
}
void displayBalance() {
System.out.println("Balance: $" + balance);
  }
}
class CurAcct extends Account {
double minBalance;
double serviceCharge;
CurAcct(String name, int accNo, String accType, double initialBalance, double
minBal, double charge) {
super(name, accNo, accType, initialBalance);
minBalance = minBal;
serviceCharge = charge;
}
void withdraw(double amount) {
if (balance - amount >= minBalance) {
balance -= amount;
System.out.println("Withdrawal of $" + amount + " successful.");
} else {
System.out.println("Insufficient funds. Withdrawal failed.");
}
}
void deductServiceCharge() {
if (balance < minBalance) {
balance -= serviceCharge;
System.out.println("Service charge of $" + serviceCharge + " applied
due to balance below minimum.");
}
}
}
class SavAcct extends Account {
double interestRate;
SavAcct(String name, int accNo, String accType, double initialBalance, double
interest) {
super(name, accNo, accType, initialBalance);
interestRate = interest;
}
void calculateInterest() {
double interest = balance * interestRate / 100;
balance += interest;
System.out.println("Interest of $" + interest + " added.");
  }
void withdraw(double amount) {
if (balance - amount >= 0) {
balance -= amount;
System.out.println("Withdrawal of $" + amount + " successful.");
} else {
System.out.println("Insufficient funds. Withdrawal failed.");
}
}
}
class Bank {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
SavAcct savings = new SavAcct("John Doe", 123456, "Savings", 1000, 5);
CurAcct current = new CurAcct("Jane Doe", 654321, "Current", 2000, 500, 10);
System.out.println("Welcome to our bank!");
while (true) {
System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Balance\n4.
Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:System.out.print("Enter amount to deposit: ");
      double depositAmount = scanner.nextDouble();
      System.out.print("Select account (1 for Savings, 2 for
      Current): ");
int accountChoice = scanner.nextInt();
if (accountChoice == 1)
savings.deposit(depositAmount);
else if (accountChoice == 2)
current.deposit(depositAmount);
break;
    case 2:System.out.print("Enter amount to withdraw: ");
           double withdrawAmount = scanner.nextDouble();
    System.out.print("Select account (1 for Savings, 2 for
Current): ");
accountChoice = scanner.nextInt();
if (accountChoice == 1)
savings.withdraw(withdrawAmount);
else if (accountChoice == 2) {
current.withdraw(withdrawAmount);
current.deductServiceCharge();
}
break;
case 3:
System.out.print("Select account (1 for Savings, 2 for
Current): ");
accountChoice = scanner.nextInt();
if (accountChoice == 1)
savings.displayBalance();
else if (accountChoice == 2)
current.displayBalance();
break;
case 4:
System.out.println("Thank you for banking with us!");
System.exit(0);
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
}
