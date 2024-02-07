package DAY7.C2;

import java.util.*;

public class TransactionManager {
    BankAccount[] arr = new BankAccount[2];
    private ArrayList<BankAccount> arrayOfAccounts = new ArrayList<>();
    SavingsAccount save = new SavingsAccount(3432, 1000);
    CheckingAccount check = new CheckingAccount(3000, 2500);
    public TransactionManager() {


        arrayOfAccounts.add(save);
        arrayOfAccounts.add(check);
        arrayOfAccounts.add(new CheckingAccount(1101, 1600));
    }
    public void printInfo(BankAccount bankAccount){
        for(int i=0;i<arrayOfAccounts.size();i++) {
            printInfo(arrayOfAccounts.get(i));
        }

    }


}

