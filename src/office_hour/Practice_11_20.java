package office_hour;

import java.util.Scanner;

public class Practice_11_20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("What is your full name");
        String fullName = scan.nextLine();

        System.out.println("You are "+fullName+" and you are "+age+" years old.");


        // if you want to run this code without any issue either put "scan.nextLine();" to line13 or
        // write your full answer on your age line like "33 Okan Dogan" (it is wierd)

    }


}
