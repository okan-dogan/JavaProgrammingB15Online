package repl_it;

import java.util.Scanner;

public class Repl_It_107_SliceNumbers {

    public static void main(String[] args) {

//        In this task, you need to slice an integer and print numbers one by one from new line.
//
//                Create a scanner object
//
//        Example # 1
//                -Display prompt: Enter your number:
//        12345
//                -Display prompt: 1
//                -Display prompt: 2
//                -Display prompt: 3
//                -Display prompt: 4
//                -Display prompt: 5
//
//        Example # 2
//
//                -Display prompt: Enter your number:
//        45678
//                -Display prompt: 4
//                -Display prompt: 5
//                -Display prompt: 6
//                -Display prompt: 7
//                -Display prompt: 8
//
//        Use / and % operators

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scan.nextInt();
        int remainder = 10000;

        for (int i = 5; i >=1 ; i--) {
            System.out.println(number/remainder);
            number=number%remainder;
            remainder/=10;
        }



    }
}
