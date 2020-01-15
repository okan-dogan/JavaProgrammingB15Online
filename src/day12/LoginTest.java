package day12;

import java.util.Scanner;

public class LoginTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username and password");
        String userName, userPassword;
        userName = scan.next();
        userPassword = scan.next();

        if (userName.equals("user123")&&userPassword.equals("pass123")){
            System.out.println("Login Successful");
        }else if (!userName.equals("user123")){
            System.out.println("Username is not correct");
        }else if (!userPassword.equals("pass123")){
            System.out.println("Password is not correct");
        }
    }
}
