package repl_it;

import java.util.Scanner;

public class Repl_It_106_PrintVowels {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        String vowels="";
        for(int i=0; i<=word.length()-1 ;i++){
          if(word.substring(i,i+1).equalsIgnoreCase("a")
            ||word.substring(i,i+1).equalsIgnoreCase("e")
            ||word.substring(i,i+1).equalsIgnoreCase("i")
            ||word.substring(i,i+1).equalsIgnoreCase("o")
            ||word.substring(i,i+1).equalsIgnoreCase("u")){
                vowels+=word.substring(i,i+1);
            }
        }
        System.out.println(vowels);

    }
}
