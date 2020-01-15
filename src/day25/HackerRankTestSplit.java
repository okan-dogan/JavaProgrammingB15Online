package day25;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRankTestSplit {

    public static void main(String[] args) {

        //Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!

        String s = "He is a very very good boy, isn't he?";
        s=s.replace(",","");
        String[] allWords = s.split("[ !,?._'@]");
        System.out.println(allWords.length);
        for(int i = 0 ; i<allWords.length ; i++ ){

            System.out.println(allWords[i]);

        }

    }
}
