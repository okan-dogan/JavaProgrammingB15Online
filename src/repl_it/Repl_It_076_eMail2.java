package repl_it;

import java.util.Scanner;

public class Repl_It_076_eMail2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String lastName="";
        String firstName="";
        String domainName="";
        String topLevelDomain="";
        if(email.contains("_")){
            firstName=email.substring(0,email.indexOf("_"));
            firstName=firstName.toUpperCase().substring(0,1)+firstName.toLowerCase().substring(1);
            lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
            lastName=lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
            domainName=email.substring(email.indexOf("@")+1,email.indexOf("."));
            topLevelDomain=email.substring(email.indexOf(".")+1);
        }
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domainName);
        System.out.println("Top-Level Domain: "+topLevelDomain);

    }
}
