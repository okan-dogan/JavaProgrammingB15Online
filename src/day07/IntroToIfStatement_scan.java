package day07;

import java.util.Scanner;

public class IntroToIfStatement_scan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your score?");

        int score = scan.nextInt();

        if (score>60) {

            System.out.println("Chocolate for you!!!");
        }else {

            System.out.println("Don't worry, try harder for the next time.");

        }

    }
}
