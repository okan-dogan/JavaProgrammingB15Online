package day06;

public class CoinConverter {

    public static void main(String[] args) {

        // you have $2, how many quarter you can get / how many dime you can get / how many nickel you can get / how many penny you can get

        int centInPocket = 200;

        // you have purchase candle for 74 cent
        // what would be your remainder?

        System.out.println("I have "+centInPocket+ " cents in my pocket.");
        centInPocket -= 74;

        System.out.println("I have spent 74 of it and remained "+centInPocket+" cents.");
        int remainerPennyInPocket = centInPocket%25;
        int quarter = centInPocket/25;
        int dime = centInPocket/10;
        int nickel = (centInPocket%10)%5;
        int lastRemainder = centInPocket%5;
        System.out.println( "Then, I have "+quarter+ " quarters and "+remainerPennyInPocket+ " penny." );

        System.out.println("It equals "+dime+ " dimes, "+nickel+" nickel and "+lastRemainder+ " penny.");

    }
}
