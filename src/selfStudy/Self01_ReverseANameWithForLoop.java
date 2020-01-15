package selfStudy;

import java.util.Scanner;

public class Self01_ReverseANameWithForLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = scan.nextLine();

        int nameLength = name.length();
        int nameFor = nameLength;
        String reversedName ="";


        System.out.println("Your name's reverse written format is;");

        for (int i = 0; i < nameFor ; i++) {

            reversedName += name.charAt(nameLength-1);

            System.out.print(name.charAt(nameLength-1)+" ");
            nameLength--;

        }
        System.out.println();
        System.out.println("Your reversed name is: " + reversedName);
    }
}
