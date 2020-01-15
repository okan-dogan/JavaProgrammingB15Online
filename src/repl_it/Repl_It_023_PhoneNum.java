package repl_it;

import java.util.Scanner;

public class Repl_It_023_PhoneNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your phone number?");

        int areaCode = scan.nextInt();
        int localNumber = scan.nextInt();
        String phoneNumber = "Calling number "+"("+areaCode+")-"+localNumber;
        System.out.println(phoneNumber);

    }
}
