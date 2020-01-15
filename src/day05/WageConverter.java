package day05;

import java.util.Scanner;

public class WageConverter {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.println("Sorry to pry but what is your hourly salary?");
        int hourlySalary = scan.nextInt();
        int yearlySalary = hourlySalary*2080;
        System.out.println("Woooow !! Do you know your yearly salary equals $"+yearlySalary+ " ??? You are rich.");



    }


}
