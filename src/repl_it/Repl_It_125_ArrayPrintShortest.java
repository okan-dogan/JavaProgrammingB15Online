package repl_it;
/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace
output: red
 */
import java.util.Arrays;
import java.util.Scanner;

public class Repl_It_125_ArrayPrintShortest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortestWord = str[0];

        for (String eachWord : str) {
            if(eachWord.length()<shortestWord.length()){
                shortestWord=eachWord;
            }
        }
        System.out.println(shortestWord);

    }
}
