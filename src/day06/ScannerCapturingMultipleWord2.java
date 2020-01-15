package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord2 {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name, last name? What is your state, city and street name?");
        String info = blabla.nextLine();

        System.out.println("You have entered "+info);



    }
}
