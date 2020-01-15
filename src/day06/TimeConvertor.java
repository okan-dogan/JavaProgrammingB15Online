package day06;

import java.util.Scanner;

public class TimeConvertor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many minutes do we have?");

        int minute = scan.nextInt();
        int hour = minute/60;
        int minutes = minute%60;



        System.out.println("Woooww..It equals "+hour+" and "+minutes+".");


    }
}
