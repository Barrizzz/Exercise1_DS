public class BankAccount {
    // Attributes (set as private as per recommendation of the great Jude Joseph Lamung Martinez)
    private int accountNumber;
    private String accountHolderName;
    private long accountBalance;

    // Getter and Setter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter and Setter for accountBalance
    public long getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Methods
    public void Deposit(long amount) {
        accountBalance += amount;
    }
    public void Withdraw(long amount) {
        accountBalance -= amount;
    }
}

