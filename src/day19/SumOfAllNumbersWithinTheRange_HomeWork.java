package day19;

import java.util.Scanner;

public class SumOfAllNumbersWithinTheRange_HomeWork {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter two numbers (second one must be more than the first one)");

        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int sum = 0;

        for(int i=num1 ;i<=num2;i++){
            sum+=i;
        }
        System.out.println(sum);


    }
}
