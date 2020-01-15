package day12;

import java.util.Scanner;

public class LoginTest_WithoutCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username and password");
        String userName, userPassword;
        userName = scan.next();
        userPassword = scan.next();

        if (userName.equalsIgnoreCase("user123")&&userPassword.equalsIgnoreCase("pass123")){
            System.out.println("Login Successful");
        }else if (!userName.equalsIgnoreCase("user123")){
            System.out.println("Username is not correct");
        }else if (!userPassword.equalsIgnoreCase("pass123")){
            System.out.println("Password is not correct");
        }
    }
}
