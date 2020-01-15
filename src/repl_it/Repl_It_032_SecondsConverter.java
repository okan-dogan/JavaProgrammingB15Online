package repl_it;

import java.util.Scanner;

public class Repl_It_032_SecondsConverter {

    public static void main(String[] args) {

        //        Write a program that outputs the number of hours, minutes, and seconds that
        //        corresponds to input total seconds.

        Scanner scan = new Scanner(System.in);

        int inputSeconds, hours, minutes, seconds =0;

        System.out.println("Enter seconds:");

        inputSeconds = scan.nextInt();
        hours=inputSeconds/3600;
        minutes=(inputSeconds%3600)/60;
        seconds=(inputSeconds%3600)%60;

        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");



    }
}
