package DAY7.C2;

public class Main {
    public static void main(String[] args) {
        SavingsAccount save = new SavingsAccount(3432, 1000);
        CheckingAccount check = new CheckingAccount(3000, 2500);

        save.deposit(500);
        save.withdraw(200);
        check.withdraw(500);
        System.out.println(save.toString());
        System.out.println(check.toString());
    }
}
