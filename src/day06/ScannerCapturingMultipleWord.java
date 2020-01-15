package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name, last name and age?");
        String name = blabla.next();
        String lastName = blabla.next();
        int age = blabla.nextInt();

        System.out.println("You have entered "+name+ " as name, you have entered "+lastName+" as last name and you have entered "+age+" as your age.");




    }
}
