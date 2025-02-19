public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        
        // Initial setup, using a setter method
        account.setAccountNumber(123456);
        account.setAccountHolderName("Prabowo Subby");
        account.setAccountBalance(271000000000L);
        // Set interest rate to 12%
        account.setInterestRate(12);
        
        // Deposit and Withdraw
        account.Deposit(2000);
        account.Withdraw(500);

        // Account Number and Account Holder Name
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        
        // Balance before interest
        System.out.println("Account Balance: " + account.getAccountBalance());

        // Add interest
        account.AddInterest();
        
        // Balance after interest
        System.out.println("Account Balance: " + account.getAccountBalance());
    }
}
