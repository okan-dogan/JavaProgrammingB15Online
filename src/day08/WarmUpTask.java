package day08;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scan.nextInt();

        System.out.println( age >=18 );

        if (age >=18){

            System.out.println("Congrats!!! You are eligible for voting. Please vote and wait for the results with your popcorn");

        }else{

            System.out.println("I'm sorry!!! You are not eligible for voting. Please grow up and try it later.");


        }



    }
}
