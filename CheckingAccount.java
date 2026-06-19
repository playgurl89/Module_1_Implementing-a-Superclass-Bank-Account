public class CheckingAccount extends BankAccount {


private double interestRate;
private static final double OVERDRAFT_FEE = 30.00;

public CheckingAccount(double interestRate) {
    super();
    this.interestRate = interestRate;
}

// Required overdraft processing method
public void processWithdrawal(double amount) {

    balance -= amount;

    if (balance < 0) {
        balance -= OVERDRAFT_FEE;

        System.out.printf(
            "Withdrawal of $%.2f processed.%n", amount);
        System.out.printf(
            "Overdraft fee of $%.2f has been assessed.%n",
            OVERDRAFT_FEE);
        System.out.printf(
            "New Balance: $%.2f%n", balance);
    } else {
        System.out.printf(
            "Withdrawal of $%.2f processed.%n", amount);
        System.out.printf(
            "New Balance: $%.2f%n", balance);
    }
}

// Required display method
public void displayAccount() {
    accountSummary();
    System.out.printf("Interest Rate: %.2f%%%n", interestRate);
}

public double getInterestRate() {
    return interestRate;
}

public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
}


}
