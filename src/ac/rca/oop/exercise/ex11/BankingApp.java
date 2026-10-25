package ac.rca.oop.exercise.ex11;

public class BankingApp {
    public static void main(String[] args) {
        Account account = new Account(1, "Angella", "1200580012345678",
                "2005-04-12", "ACC-001", 50000);

        account.displayAccount();
        System.out.println();

        account.deposit(20000);
        account.deposit(-500);
        account.withdraw(30000);
        account.withdraw(100000);
    }
}