package ac.rca.oop.exercise.ex11;

public class Account extends Person {

    private String accountNumber;
    private double balance;

    public Account(int id, String name, String identity, String dob,
                   String accountNumber, double balance) {
        super(id, name, identity, dob);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount + " | New balance: " + balance);
        } else {
            System.out.println("Deposit failed: amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw failed: amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Withdraw failed: insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount + " | New balance: " + balance);
        }
    }

    public void displayAccount() {
        displayPerson();
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}