package repl_it;

import java.util.Scanner;

public class Repl_It_034_Vending_Machine {

    public static void main(String[] args) {

//        Write a program that determines the change to be dispensed from a vending
//        machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
//        increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
//        dollar bill to pay for the item.

        int itemPrice=0;
        int forVending=0;
        int quarters=0;
        int dimes=0;
        int nickels=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents:");

        itemPrice=scan.nextInt();
        if(itemPrice<25 || itemPrice>100 || itemPrice%5!=0){
            System.out.println("Invalid price!");
        }else{
            forVending=100-itemPrice;
            quarters=forVending/25;
            dimes=(forVending%25)/10;
            nickels=((forVending%25)%10)/5;

            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");

        }


    }
}
