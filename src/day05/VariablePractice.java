package day05;

import java.util.Scanner;

public class VariablePractice {


    public static void main(String[] args) {

        int birthYear = 1986;
        int currentYear = 2019;

        System.out.println("Hey, I was born in " +birthYear+ ". And now I'm " +(currentYear-birthYear)+ " years old.");

        System.out.println("Hey, I was born in " +1986+ ". And now I'm " +(2019-1986)+ " years old.");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year please : ");
        int age = scan.nextInt();
        System.out.println("Your age is : " + (2019-age));





    }
}
