package day05;

import java.util.Scanner;

public class GroceryAction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the price for tomato?");
        float priceOfTomato = scan.nextFloat();
        System.out.println("How many tomatos do you want to buy?");
        int countOfTomato = scan.nextInt();
        System.out.println("Your total is $"+(priceOfTomato*countOfTomato)+" for domatos.");
        float totToma = priceOfTomato*countOfTomato;

        System.out.println("What is the regular price for this item?");
        float regularPrice = scan.nextFloat();
        System.out.println("What is the discount for this item?");
        int discount = scan.nextInt();
        System.out.println("Then; if the regular price is $"+regularPrice+", and the dicount is 20%, my total is $"+(regularPrice*20/100*discount)+".");



        System.out.println("What is the price for potato?");
        float priceOfPotato = scan.nextFloat();
        System.out.println("How many potatos do you want to buy?");
        int countOfPotato = scan.nextInt();
        System.out.println("Your total is $"+(priceOfPotato*countOfPotato)+" for potatos.");
        float totPota = priceOfPotato*countOfPotato;


        System.out.println("What is the price for banana?");
        float priceOfBanana = scan.nextFloat();
        System.out.println("How many bananas do you want to buy?");
        int countOfBanana = scan.nextInt();
        System.out.println("Your total is $"+(priceOfBanana*countOfBanana)+" for bananas.");
        float totBana = priceOfBanana*countOfBanana;


        System.out.println("So; your total purchase is $"+(totToma+totPota+totBana)+". We appreciate your business.");

    }
}
