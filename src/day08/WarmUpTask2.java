package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is favorite number?");
        int favNum = scan.nextInt();

        if (favNum ==300){

            System.out.println("Congrats!!! You know your job");

        }else{

            System.out.println("I'm sorry!!! Try again.");


        }



    }
}
