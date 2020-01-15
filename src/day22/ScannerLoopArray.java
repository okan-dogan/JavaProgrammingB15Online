package day22;

import java.util.Scanner;

public class ScannerLoopArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int [10];

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter your number "+(i+1));
            numbers[i]=scan.nextInt();
        }
        System.out.println("Your Numbers Are:");

        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
