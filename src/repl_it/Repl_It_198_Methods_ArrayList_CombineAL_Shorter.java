package repl_it;
/*
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1,
and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings,
add all the words (in order) from wordList1,
then add all the words (in order) from wordList2.
In other words, it is combining all the elements from the two parameters.
 */


import java.util.ArrayList;

public class Repl_It_198_Methods_ArrayList_CombineAL_Shorter {

    public static ArrayList<String> combineAL(ArrayList<String>wordList1,ArrayList<String>wordList2){
        wordList1.addAll(wordList2);
        return wordList1;
    }

    public static void main(String[] args){


    }


}




