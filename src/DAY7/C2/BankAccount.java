package DAY7.C2;

import javax.swing.plaf.PanelUI;
import java.util.*;
public abstract class BankAccount{
    private int id;
    protected double balance;
    private Date dateCreated;

    BankAccount(){
        this.id=222;
        this.balance=0.00;
        this.dateCreated=new Date();
    }
    BankAccount(int id,double balance){
        this.id=id;
        this.balance=balance;
        this.dateCreated=new Date();
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }
    public void withdraw(double amount){
        if (amount>0){
            if (amount<=this.balance){
                this.balance-=amount;
                System.out.println("Successful,your current balance: "+this.balance);
            }
            else {
                System.out.println("insufficient balance in your account");
                System.out.println("your current balance is. "+this.balance);
            }
        }
        else {
            System.out.println("your amount should be larger than 0");
        }
    }
    public void deposit(double amount){
        if( amount>0){
            this.balance+=amount;
        }
        else{
            System.out.println("your amount should be larger than 0");
        }
    }
    @Override
    public String toString(){
        return "your id is: "+this.id+" and your balance is: "+this.balance +" and you have created this account at: "+this.dateCreated.toString();

    }
}