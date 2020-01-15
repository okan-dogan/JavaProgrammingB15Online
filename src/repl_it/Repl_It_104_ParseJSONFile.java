package repl_it;

import java.util.Scanner;

public class Repl_It_104_ParseJSONFile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();

        System.out.println("First name: "+json.substring(json.indexOf("firstName")+13,json.indexOf("\"",json.indexOf("firstName")+13)));
        System.out.println("Last name: "+json.substring(json.indexOf("lastName")+12,json.indexOf("\"",json.indexOf("lastName")+12)));


    }
}
