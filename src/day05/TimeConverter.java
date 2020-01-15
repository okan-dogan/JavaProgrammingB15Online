package day05;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("How many days has it been since your course started?");
        int dayOfCourse = scan.nextInt();
        int minOfCourse = dayOfCourse*1440;
        System.out.println(dayOfCourse+" days??? Woooow !! Do you know it equals "+minOfCourse+ " minutes???");


        System.out.println("Sorry to pry but what is your hourly salary?");
        int hourlySalary = scan.nextInt();
        int yearlySalary = hourlySalary*2080;
        System.out.println("Woooow !! Do you know your yearly salary equals $"+yearlySalary+ " ??? You are rich.");



    }


}
