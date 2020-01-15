package repl_it;

import day06.SaleCalculator;

import java.util.Scanner;

public class Repl_It_064_Middle_One {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter something to get the middle:");

        String word = scan.next();

        if (word.length()==1){
            System.out.println(word+word+word);
        }else if (word.length()==2){
            System.out.println(word+word);
        }else if (word.length()%2==1){
            System.out.println(""+word.charAt(word.length()/2));
        }else if (word.length()%2==0){
            System.out.println(""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2));
        }else{
            System.out.println("Invalid Input");
        }

    }
}
