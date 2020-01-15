package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReviewTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int[] numbers = new int[5];

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Please enter "+i+"./5 number;");
            int num = scan.nextInt();
            numbers[i-1]=num;
        }
        System.out.println("Your numbers are "+ Arrays.toString(numbers));

    }
}
