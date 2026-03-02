public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully.");
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, "John Doe");
        account.deposit(1000);
        account.withdraw(500);
        account.displayAccountInfo();
    }
}
