package day12;

import java.util.Scanner;

public class LoginTest_v2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username");
        String userName;
        userName = scan.next();
        System.out.println("Please enter your password");
        String userPassword;
        userPassword = scan.next();

        if (userName.equals("user123")&&userPassword.equals("pass123")){
            System.out.println("Login Successful");
        }else if (!(userName.equals("user123")||userPassword.equals("pass123"))){
            System.out.println("Both Username and Password are not correct");
        }else if (!userName.equals("user123")){
            System.out.println("Username is not correct");
        }else if (!userPassword.equals("pass123")){
            System.out.println("Password is not correct");
        }
    }
}
