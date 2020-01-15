package Tests;

import java.util.Scanner;

public class HackerRank_nextLine {

    public static void main(String[] args) {
        //inputs are;
        // 100
        // 42
        // 42 is the key
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();


        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
