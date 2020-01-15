package repl_it;
/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]
 */
import java.util.Arrays;
import java.util.Scanner;

public class Repl_It_140_ArrayPrintFirstLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        String[] firstSecondChar = new String[5];

        for (int i = 0; i <5 ; i++) {
            firstSecondChar[i]=words[i].substring(0,1)+words[i].substring(words[i].length()-1);
        }
        System.out.println(Arrays.toString(firstSecondChar));




    }
}
