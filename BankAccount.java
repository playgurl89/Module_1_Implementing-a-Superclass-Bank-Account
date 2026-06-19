public class BankAccount {
private String firstName;
private String lastName;
private int accountID;
protected double balance;


// Constructor
public BankAccount() {
    balance = 0.0;
}

// Deposit method
public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.printf("$%.2f deposited successfully.%n", amount);
    } else {
        System.out.println("Deposit amount must be greater than zero.");
    }
}

// Withdrawal method
public void withdrawal(double amount) {
    if (amount > 0) {
        balance -= amount;
        System.out.printf("$%.2f withdrawn successfully.%n", amount);
    } else {
        System.out.println("Withdrawal amount must be greater than zero.");
    }
}

// Getters and Setters
public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public int getAccountID() {
    return accountID;
}

public void setAccountID(int accountID) {
    this.accountID = accountID;
}

public double getBalance() {
    return balance;
}

// Account summary
public void accountSummary() {
    System.out.println("\n----- Account Summary -----");
    System.out.println("Account Holder: " + firstName + " " + lastName);
    System.out.println("Account ID: " + accountID);
    System.out.printf("Current Balance: $%.2f%n", balance);
}


}
