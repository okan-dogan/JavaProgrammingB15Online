package repl_it;

import java.util.Scanner;

/*
Complete a void method printUniqueWords()
that will print only unique words from an array of strings.
Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python

 */
public class Repl_It_160_Methods15_PrintUniqueWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for (int i = 0; i <words.length ; i++) {
            int counter = 0;
            for (int j = 0; j <words.length ; j++) {
                if(words[i].equals(words[j])){
                    counter++;
                }
            }
            if(counter==1){
                System.out.println(words[i]);
            }
        }


    }


}

