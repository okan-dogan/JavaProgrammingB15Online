package repl_it;

import java.util.Scanner;

public class Repl_It_110_ArrayPrintFirstAndLast {

    public static void main(String[] args) {

//        Given a String array words,
//        iterate through each word and print first and last letter of each element in separate lines.
//
//        words → ["hello", "why", "by", "apple" , "note"]
//print:
//       ho
//       wy
//       by
//       ae
//       ne

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i = 0; i <words.length ; i++) {
            System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1));
        }



    }
}
