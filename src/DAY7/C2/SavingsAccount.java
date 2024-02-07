package DAY7.C2;

public class SavingsAccount extends BankAccount {


    SavingsAccount(){
        super();
    }
    SavingsAccount(int id,double balance){
        super(id, balance);
    }
    @Override
    public void withdraw(double amount){
        System.out.println("Ops, this saving account, you cannot withdraw money");
    }


    @Override
    public String toString(){
        return "Saving account. your id is: "+ this.getId() +" and your balance is: "+this.balance +" and you have created this account at: "+this.getDateCreated().toString();

    }


}


