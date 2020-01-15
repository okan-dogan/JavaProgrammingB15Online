package day04;

import java.util.Scanner;

public class ScannerIntro {


    public static void main(String[] args) {

        // I want to save users input after asking some questions
        // and I want to save this input so I can do something with it

        // Step 1 :  Use Scanner class to create scanner object
        // that have this functionality
        Scanner scan = new Scanner(System.in);

        // ask user to enter name
        System.out.println("Enter your first name please : ");

        // capture what user typed on keyboard in console
        String firstName = scan.next();

        // print the result of what the user save from user input
        System.out.println("You have entered : " + firstName);

        System.out.println("Enter your last name please : ");
        String lastName = scan.next();
        System.out.println("You have entered : " + lastName);

        System.out.println("Enter your age please : ");
        int age = scan.nextInt();
        System.out.println("You have entered : " + age);

        // scan.nextInt(); is used for single numbers
        // scan.next(); is used for both text and number

        System.out.println("Enter your country please : ");
        String countryName = scan.next();
        System.out.println("You have entered : " + countryName);


    }


}