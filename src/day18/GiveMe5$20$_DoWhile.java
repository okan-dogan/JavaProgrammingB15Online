package day18;

import java.util.Scanner;

public class GiveMe5$20$_DoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 0;

        do{
            System.out.println("Please give me $5 or $20");
            x = scan.nextInt();
            if(!(x==5 || x==20)){
                System.out.println("It is not I'm looking for");
            }
        }while(!(x==5 || x==20));
        System.out.println("Happy End! Got the money!");

    }
}
