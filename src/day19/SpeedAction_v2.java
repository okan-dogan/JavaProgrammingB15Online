package day19;

import java.util.Scanner;

public class SpeedAction_v2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your start speed?");
        int start=scan.nextInt();

        System.out.println("What is your end speed?");
        int end=scan.nextInt();
        // by this way you can hold the initial value of the start (10)
        // you only change the value of i
        for(int i=start; i<=end ; i++){
            System.out.print(i+" ");
        }
        System.out.println(start); // start still is the same as the input
    }
}
