package day46;

public class AtTheBank {

    public static void main(String[] args) {
        
        CheckingAccount cA1= new CheckingAccount("Zehra",54321,10000);
        cA1.deposit(100);
        System.out.println("cA1 = " + cA1);
        cA1.deposit(5000);
        System.out.println("cA1 = " + cA1);
        cA1.withdraw(5300);
        System.out.println("cA1 = " + cA1);




    }



}
