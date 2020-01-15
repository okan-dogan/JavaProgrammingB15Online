package day08;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your current speed?");

        int yourCurrentSpeed = keyboard.nextInt();

        boolean mySpeed = yourCurrentSpeed>60 ;

        if (mySpeed){ // you can write also 'if (true)' or 'if (yourCurrentSpeed>60)
            System.out.println("You are too fast! ");
        } else {
            System.out.println("Then you are ok. Go on and drive safe.");
        }



    }
}
