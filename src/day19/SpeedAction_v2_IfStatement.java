package day19;

import java.util.Scanner;

public class SpeedAction_v2_IfStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your start speed?");
        int start=scan.nextInt();

        System.out.println("What is your end speed?");
        int end=scan.nextInt();

        if (start<end){
            for(int i=start; i<=end ; i++){
                System.out.print(i+" ");
            }
        }else if(start>end){
            for(int i=start; i>=end ; i--){
                System.out.print(i+" ");
            }
        }else{
            System.out.println("Your speeds are the same");
        }
    }
}
