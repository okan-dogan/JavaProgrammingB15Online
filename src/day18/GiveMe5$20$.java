package day18;

import java.util.Scanner;

public class GiveMe5$20$ {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please give me $5 or $20");

        int x = scan.nextInt();

            // (!(x==5 || x==20)) gives the same result with (x!=5 && x!=20)
        while (x!=5 && x!=20){
            System.out.println("It is not what I am looking for");
            System.out.println("Please GIVE ME 5 or 20");
            x = scan.nextInt();
        }

        System.out.println("Happy End! Got the money!");

    }
}
