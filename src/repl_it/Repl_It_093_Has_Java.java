package repl_it;

import java.util.Scanner;

public class Repl_It_093_Has_Java {

    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length()<4) {
            System.out.println(exists);
        }else if(word.substring(0,4).equals("java")||word.substring(1,5).equals("java")){
            System.out.println(!exists);
        }else{
            System.out.println(exists);
        }
    }
}
