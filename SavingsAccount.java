public class SavingsAccount extends BankAccount {
    // Private attribute for interestRate
    private double interestRate;
    
    // Getter and Setter for interestRate (interest rate is in percentage)
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    // Method to add interest to the account balance
    public void AddInterest() {
        double interest = getAccountBalance() * interestRate / 100;
        Deposit((long) interest);
    }
}
