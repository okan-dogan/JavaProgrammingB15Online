package day18;

import java.util.Scanner;

public class SmartLockOpener_DoWhileVersion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Knock Knock Knock!!");

        String password ="";

        do {
            System.out.println("What is the password?");
            password = scan.next();
        }while(!password.equals("B15"));

        System.out.println("Open Sesame!");

    }
}
