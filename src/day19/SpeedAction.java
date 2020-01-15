package day19;

import java.util.Scanner;

public class SpeedAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your start speed?");
        int a=scan.nextInt();
        int start = a;

        // by this way you are changing the value of start
        // (from 10 to 28)
        // if you don't want to change this input see speedAction_v2

        System.out.println("What is your end speed?");
        int end=scan.nextInt();

        for(; start<=end;start++){
            System.out.print(start+" ");
        }
        System.out.println(start); // start has been changed from 10 to 28
    }
}
