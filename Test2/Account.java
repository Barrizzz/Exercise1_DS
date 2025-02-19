package Test2;
public class Account {
    private int number;
    private double balance;

    public Account(int number) {
        this.number = number;
    }

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account[number=" + number + ",balance=$" + balance + "]";
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount exceeded");
        }
    }

    public void transferTo(double amount, Account another) {
        if (balance >= amount) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("amount exceeded");
        }
    }

    public static void main(String[] args) {
        Account a = new Account(12345, 100);
        Account b = new Account(54321, 200);
        System.out.println(a);
        System.out.println(b);
        a.transferTo(50, b);
        System.out.println(a);
        System.out.println(b);

        a.credit(1000);
        b.debit(200);
        System.out.println(a);
        System.out.println(b);
        b.debit(50);
        System.out.println(b);
    }
}
