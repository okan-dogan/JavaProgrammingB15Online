package repl_it;

import java.util.Scanner;

public class Repl_It_096_RepeatSeperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = "";

        for (int i=count-1; i>=1 ; i--){
            result+=separator+word;
        }
        System.out.println(word+result);

    }
}
