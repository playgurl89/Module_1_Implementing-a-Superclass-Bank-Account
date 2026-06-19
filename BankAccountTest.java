public class BankAccountTest {


public static void main(String[] args) {

    CheckingAccount account = new CheckingAccount(2.75);

    account.setFirstName("Lilly");
    account.setLastName("White");
    account.setAccountID(784052873);

    System.out.println("Creating account...");
    account.displayAccount();

    System.out.println("\nDepositing $500...");
    account.deposit(500.00);

    System.out.println("\nWithdrawing $200...");
    account.processWithdrawal(200.00);

    System.out.println("\nAttempting withdrawal of $400...");
    account.processWithdrawal(400.00);

    System.out.println("\nFinal Account Information");
    account.displayAccount();
}


}
