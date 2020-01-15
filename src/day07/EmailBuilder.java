package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name, last name and company name?");

        String firstName;
        String lastName;
        String companyName;
        firstName = scan.next();
        lastName = scan.next();
        companyName = scan.next();
        String eMail = firstName+"_"+lastName+"@"+companyName+".com";

        System.out.println("You are "+firstName+" "+lastName+". Your company name is "+companyName+" and your email address is "+eMail);


    }
}
