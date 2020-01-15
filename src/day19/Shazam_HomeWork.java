package day19;

import java.util.Scanner;

public class Shazam_HomeWork {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String keyword = "";

        do{
            System.out.println("Enter the Keyword to turn into a SuperHero!");
            keyword = scan.next();
        }while(!keyword.equalsIgnoreCase("SHAZAM"));

        System.out.println("You are now SUPER HERO!!!");
    }
}
