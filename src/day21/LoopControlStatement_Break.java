package day21;

import java.util.Scanner;

public class LoopControlStatement_Break {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "";

        System.out.println("What is your name");
        name = scan.nextLine();
        int nameIndex = name.length()-1;

        for (int i = 0; i <=nameIndex ; i++) {

            if (name.substring(i,i+1).equalsIgnoreCase("b")){
                System.out.println();
                System.out.println("You've reached the b at the index "+i);
                break;
            }

            System.out.print(name.substring(i,i+1)+" ");

        }

    }
}
