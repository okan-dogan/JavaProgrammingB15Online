package repl_it;

import java.util.Scanner;

/*
Create a method that gets an array of strings and a string, the method returns an int.
It counts how many times a string appears in the array and returns the count.
for example (pseudo code):
some_array = ["a","foo","bar","foo","bla"]
some_string = "foo"
count_appearance(some_array ,some_string )
will return 2 because some_array  has 2 appearances of "foo" string.

 */
public class Repl_It_163_MethodsWithReturn1_Count_Appearance {

    public static void main(String[] args) {

    }

    public int count_appearance(String[] arr,String t){
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals(t)){
                count++;
            }
        }
        return count;
    } //end  count_appearance


}

