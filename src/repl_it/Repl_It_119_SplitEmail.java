package repl_it;

import java.util.Scanner;

/*
Given a String variable email, write code using split method to print email id and domain in separate lines.
Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */
public class Repl_It_119_SplitEmail {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        int counter = 0;

        for (int i = 0; i <email.length() ; i++) {
            if(email.substring(i,i+1).equals("@")){
                counter++;
            }
        }

        if(counter==1){
            String[] partEmail = email.split("@");
            System.out.println("Email id: "+partEmail[0]);
            System.out.println("Email domain: "+partEmail[1]);
        }else{
            System.out.println("invalid email");
        }



    }
}
