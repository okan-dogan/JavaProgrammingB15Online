package repl_it;
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 */
import java.util.Scanner;

public class Repl_It_138_ArrayReverseSentence2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String [] reverseSent = sentence.split(" ");
        for (int i = reverseSent.length-1; i >=0 ; i--) {
            reversed+=reverseSent[i];
            if(!(i==0)){
                reversed+=" ";
            }
        }


        //End your code here. do not modify below statement
        System.out.println(reversed);




    }
}
