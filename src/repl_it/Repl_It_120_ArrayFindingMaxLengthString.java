package repl_it;
/*
Given the array words, it will print the word with the largest length.
Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
import java.util.Scanner;

public class Repl_It_120_ArrayFindingMaxLengthString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        //write your code below

        String longestWord= words[0];

        for (String eachWord : words) {
            if(eachWord.length()>longestWord.length()){
                longestWord=eachWord;
            }
        }
        System.out.println(longestWord);





    }
}
