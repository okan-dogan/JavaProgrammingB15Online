package repl_it;
/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */
import java.util.Scanner;

public class Repl_It_137_ArrayReverseSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

        String[] reverseSent = sentence.split(" ");
        for(int i=reverseSent.length-1 ; i>=0 ; i--){
            System.out.println(reverseSent[i]);
        }




    }
}
