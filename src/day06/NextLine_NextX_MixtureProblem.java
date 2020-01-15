package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = blabla.nextLine();
        System.out.println("Your name is "+name);

        System.out.println("What is your last name?");
        String lastName = blabla.nextLine();
        System.out.println("Your last name is "+lastName);

        System.out.println("What is your age?");
        int age = blabla.nextInt();
        System.out.println("Your age is "+age);

        blabla.nextLine(); /* If you don't put this line, it works as enter for "What is your address?" line!!! */

        System.out.println("What is your address?");
        String address = blabla.nextLine();
        System.out.println("Your address is "+address);

    }
}
