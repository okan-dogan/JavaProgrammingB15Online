package repl_it;

import java.util.Scanner;

public class Repl_It_088_CatsAndDogs {

    public static void main(String[] args) {

//  Print true if the string "cat" and "dog" appear the same number of times in the given string word.
//    input: catdog
//    output: true
//
//    input: catcat
//    output: false
//
//    input: cat-cheetah-dog-cat
//    output: false

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        String temp3Letter="";
        for(int i=0;i<=word.length()-3;i++){
            temp3Letter=word.substring(i,i+3);
            if(temp3Letter.equalsIgnoreCase("CAT")){
                countOfCats++;
            }else if(temp3Letter.equalsIgnoreCase("DOG")){
                countOfDogs++;
            }
        }
        System.out.println(countOfCats==countOfDogs);


    }
}
