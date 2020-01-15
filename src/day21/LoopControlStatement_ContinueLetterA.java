package day21;

import java.util.Scanner;

public class LoopControlStatement_ContinueLetterA {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "";

        System.out.println("What is your name");
        name = scan.nextLine();
        int nameIndex = name.length()-1;

        for (int i = 0; i <=nameIndex ; i++) {

            if (name.substring(i,i+1).equalsIgnoreCase("a")){
                System.out.println();
                System.out.println("You've a letter a at the index "+i);
                continue;
            }
            System.out.print(name.substring(i,i+1)+" ");
        }

    }
}
