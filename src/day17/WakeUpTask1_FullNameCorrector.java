package day17;

import java.util.Scanner;

public class WakeUpTask1_FullNameCorrector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name and last name:");
        String name = scan.nextLine();


        int firstSpace = name.indexOf(" ");
        String name2 = name.substring(0,1).toUpperCase() + name.substring(1, firstSpace).toLowerCase() + " "
        + name.substring(firstSpace+1,firstSpace+2).toUpperCase() + name.substring(firstSpace+2).toLowerCase();
        System.out.println("Your name is " + name2);
        

    }
}
