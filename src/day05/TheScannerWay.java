package day05;

import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        int currentYear = 2019;

            System.out.println("What is your name?");
            String name = scan.next();

        System.out.println("Is your name "+name+"??? Are you sure?");

            System.out.println("What is your birth year?");
            int birthYear = scan.nextInt();
            System.out.println("Then you are "+ (currentYear-birthYear) +". Is it correct?");


    }
}
