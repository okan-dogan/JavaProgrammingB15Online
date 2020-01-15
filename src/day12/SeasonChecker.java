package day12;

import java.util.Scanner;

public class SeasonChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your season please");

        String season = scan.next();

        if (season.equalsIgnoreCase("spring")){
            System.out.println("Hiking, Newroz, Alergy, Cool");
        }else if (season.equalsIgnoreCase("summer")){
            System.out.println("Pool, Swimming, Beach, Vacation");
        }else if (season.equalsIgnoreCase("fall")){
            System.out.println("BBQ, Riding Bike, Halloween");
        }else if (season.equalsIgnoreCase("winter")){
            System.out.println("Ski, Snowman");
        }else {
            System.out.println("Not Valid Season");
        }


    }
}
