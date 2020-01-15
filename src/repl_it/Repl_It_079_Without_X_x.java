package repl_it;

import java.util.Scanner;

public class Repl_It_079_Without_X_x {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if((word.startsWith("x")||word.startsWith("X"))&&(word.endsWith("x")||word.endsWith("X"))){
            word=word.substring(1,word.length()-1);

        }else if(word.startsWith("x")||word.startsWith("X")){
            word=word.substring(1);

        }else if(word.endsWith("x")||word.endsWith("X")){
            word=word.substring(0,word.length()-1);
        }

        System.out.println(word);

    }
}
