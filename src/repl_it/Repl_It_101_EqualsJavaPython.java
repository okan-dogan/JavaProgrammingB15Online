package repl_it;
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string
is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
import java.util.Scanner;

public class Repl_It_101_EqualsJavaPython {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();


        int counterJava=0;
        int counterPython=0;
        for(int i=0 ; i<=sentence.length()-4 ; i++){
            if(sentence.substring(i,i+4).equals("java")){
                counterJava++;
            }
        }
        for(int i=0 ; i<=sentence.length()-6 ; i++){
            if(sentence.substring(i,i+6).equals("python")){
                counterPython++;
            }
        }
        System.out.println(counterJava==counterPython);

    }
}
