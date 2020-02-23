package day46;
/*
override deposit method
in saving account , every depisit you make you will get interest added
according to your interest rate
if you deposit 100$  your interest rate is 4.2 /100  then
your actual balance will increase with added interest
 */
public class SavingAccount extends BankAccount{


//    String accountHolder;
//    long accountNum;
//    double balance;
    double interestRate;


    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate) {

        super(accountHolder, accountNum, balance);
        this.interestRate = interestRate;

    }

    // BAD IDEA TO HAVE MAIN HERE , JUST DOING IT ANYWAY
    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount("Mohammed", 12345, 50000, 4.2);
        System.out.println("s1 = " + s1.toString());

        s1.withdraw(10000);
        System.out.println("s1 = " + s1);

        s1.deposit(100);
        System.out.println("s1 = " + s1);


    }

    // in our SavingAccount , if we withdraw amount you withdraw
    // you get 30 dollar penalty
    // so we will override the withdraw method to reflect this requirement
    @Override
    public void withdraw(int amount) {
        // taking away 30$ more on top of what you withdraw
        //balance -= 30 ;
        //balance = balance - amount -30 ;
//        balance -= amount;
//        balance -= 30; // this is the penalty
        super.withdraw(amount);
        super.withdraw(30);
        // or you can just write super.withdraw(amount+30);

    }


    @Override // this is called annotation
    // it will ensure this is actually a valid overridden method
    // if any rule does not match , it will not even compile
    public void deposit(int amount){
        //balance += amount + amount*interestRate;
        // calculating the interest rate and casting to int variable
        // because deposit method accept int data type not double !!!!
        super.deposit( amount + (int) (amount*(1+interestRate/100)));
    }


    // in our SavingAccount , if you withdraw any amount of money
    // you will get 30 dollar penalty
    // so we will override the withdraw method to reflect this requirement

    @Override // its optional , once being used , it will enforce overriding rule
    // if any rule does not match it will not even compile
    // so it's always good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }




}
