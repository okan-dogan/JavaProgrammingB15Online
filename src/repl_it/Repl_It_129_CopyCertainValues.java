package repl_it;
/*
Given a String array arr with the following elements
["zero", "one", "two","three","four"]
Create another array fewValues and copy words that have letter "e" in them
You need to know how many element contain "e" and create array accordingly
Values in fewValues array need to be["zero", "one","three"]

Examples:
arr -> ["aa", "be", "lol", "lel", "oreo"]
fewValues -> ["be",  "lel", "oreo"]

arr -> ["e", "hey", "bye", "furey", "spoon"]
fewValues ->["e", "hey", "bye", "furey"]
 */
import java.util.Arrays;
import java.util.Scanner;

public class Repl_It_129_CopyCertainValues {

    public static void main(String[] args) {

        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }

    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

        String wordsE = "";

        for (String each : arr) {
            if(each.contains("e")){
                wordsE+=each+",";
            }
        }
        String[]fewValues=wordsE.split(",");


        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }


}

