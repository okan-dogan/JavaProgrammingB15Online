package day06;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the regular price for this item?");
        double regularPrice = scan.nextDouble();
        System.out.println("What is the discount for this item?");
        double discount = scan.nextDouble();
        System.out.println("Then; if the regular price is $" + regularPrice + ", and the dicount is 20%, my total is $" + (regularPrice-(regularPrice*discount/100)) + ".");
        System.out.println("Then; if the regular price is $" + regularPrice + ", and the dicount is 20%, my total is $" + (regularPrice*(1-(discount/100))) + ".");

    }

}