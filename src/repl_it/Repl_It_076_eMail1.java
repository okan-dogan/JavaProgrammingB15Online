package repl_it;

import java.util.Scanner;

public class Repl_It_076_eMail1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String lastName="";
        String firstName="";
        if(email.contains("_")){
            firstName=email.substring(0,email.indexOf("_"));
            lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
            email=lastName+"_"+firstName+email.substring(email.indexOf("@"));
        }
        System.out.println(email);

    }
}
