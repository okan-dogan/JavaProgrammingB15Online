package repl_it;
/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */
import java.util.Scanner;

public class Repl_It_135_ArraySplitSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String[] splitSentence = sentence.split(" ");

        for (String eachSplit : splitSentence) {
            System.out.println(eachSplit);
        }




    }
}
