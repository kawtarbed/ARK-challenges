package DAY7.C2;

public class CheckingAccount extends BankAccount {
    private int limit=1000;
    CheckingAccount(){
        super();

    }
    CheckingAccount(int id,double balance){
        super(id, balance);
    }
    @Override
    public void withdraw(double amount){
        if (amount>0){
            if (amount<=this.balance && amount<=limit){
                this.balance-=amount;
                System.out.println("Seccessful,your current balance: "+this.balance);
            } else if (amount>limit) {
                System.out.println("you are exceeding the limit of "+this.limit);

            } else {
                System.out.println("insufficient balance in your account");
                System.out.println("your current balance is. "+this.balance);
            }
        }
        else {
            System.out.println("your amount should be larger than 0");
        }
    }
    @Override
    public String toString(){
        return "Checking account. your id is: "+ this.getId() +" and your balance is: "+this.balance +" and you have created this account at: "+this.getDateCreated().toString();

    }
}

