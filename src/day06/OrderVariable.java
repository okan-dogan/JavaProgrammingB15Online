package day06;

import java.util.Scanner;

public class OrderVariable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How much for your order?");

        int yourOrder = scan.nextInt();
        int myOrder = yourOrder;

        System.out.println("Oh my gosh, my order is also for $"+myOrder);


    }
}
