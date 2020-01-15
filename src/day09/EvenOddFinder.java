package day09;

import java.util.Scanner;

public class EvenOddFinder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write a number please!");

        int myNumber = scan.nextInt();

        int remainderOfTheNum = myNumber%2;

        if (remainderOfTheNum==0){

            System.out.println("It is an even number!!!");
        }else {
            System.out.println("It is an odd number!!!");

        }


    }
}
