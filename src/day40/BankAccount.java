package day40;

public class BankAccount {

    String accountType, accountHolder;
    long accountNumber;
    double balance;

    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance){
        accountType=newAccountType;
        accountHolder=newAccountHolder;
        accountNumber=newAccountNumber;
        balance=newBalance;
    }


    public void showAccountBalance(){
        System.out.println("Current Balance = "+balance);
    }

    public void showAccountType(){

    }

    public double getBalance(){


        return balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public void withdraw100Cash(){
        balance-=100;
    }

    public void purchaseProduct(double price, int count){
        double totalPrice = price*count;
        balance-=totalPrice;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
