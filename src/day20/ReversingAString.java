package day20;

import java.util.Scanner;

public class ReversingAString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type something to be reversed:");

        String name = scan.nextLine();

        int nameLength = name.length();
        int nameFor = nameLength;
        String reversedName =""; 

        System.out.println("Your word's reverse order format is;");

        for (int i = 0; i < nameFor ; i++) {
            
            reversedName += name.charAt(nameLength-1); 

            System.out.print(name.charAt(nameLength-1)+" ");
            nameLength--;

        }
        System.out.println();
        System.out.println("Your reversed word = " + reversedName);
        System.out.println();

    }
}
