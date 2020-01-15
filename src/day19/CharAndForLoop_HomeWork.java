package day19;

import java.util.Scanner;

public class CharAndForLoop_HomeWork {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a character to start:");
        String letter1 = scan.next();
        char firstLetter = letter1.charAt(0);

        System.out.println("Please enter a character to end:");
        String letter2 = scan.next();
        char endLetter = letter2.charAt(0);

        if(firstLetter<endLetter){
            System.out.println("From A to Z way");
            for (char iChar = firstLetter;iChar <= endLetter;iChar++){
                System.out.print(iChar+" ");

            }

        }else if(firstLetter>endLetter) {
            System.out.println("From Z to A way");
            for (char kChar = firstLetter; kChar >= endLetter; kChar--) {
                System.out.print(kChar + " ");
            }

        }else{

            System.out.println("You have entered the same letters!!!");

        }

    }
}
