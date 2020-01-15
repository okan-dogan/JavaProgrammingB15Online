package day06;

public class CompoundOperator3Remainder {

    public static void main(String[] args) {

        int bankBalance = 1140;

        System.out.println("At the first time I have $"+bankBalance+". Then, I have spent half of it and now I have just $"+(bankBalance/=2));

        bankBalance = bankBalance%500;
        System.out.println("I divide the balance by 500 and now the reminder is $"+bankBalance+" in my pocket.");
    }
}
