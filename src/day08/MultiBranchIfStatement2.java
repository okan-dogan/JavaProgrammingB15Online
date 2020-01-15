package day08;

import java.util.Scanner;

public class MultiBranchIfStatement2 {

    public static void main(String[] args) {

        Scanner keyboard  = new Scanner(System.in);

        System.out.println("What is your current speed sir?");

        int currentSpeed = keyboard.nextInt();

        if (currentSpeed>90) {
            System.out.println("Are you kidding me?! You are going to jail!!!");
        }else if (currentSpeed>70) {
            System.out.println("You are too fast! I have to take your car with tow!!!");
        }else if (currentSpeed>80) {
            System.out.println("You are fast. Can I see your paper?");
        }else if (currentSpeed>60) {
            System.out.println("You are a little bit faster than the speed limit so this time I'm warning you.");
        }else {
            System.out.println("You are good. Keep driving.");
        }

    }
}
