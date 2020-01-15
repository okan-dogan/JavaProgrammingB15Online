package repl_it;
/*
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

!!!!! wrong instuction;
For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */


import java.util.ArrayList;
import java.util.Arrays;

public class Repl_It_215_ArrayList_2Times {

    public static void main(String[] args){

        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(test));

    }
    //create your method below

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> r){
        ArrayList<Integer> twosToOne = new ArrayList<>();
        for(int i=0 ; i<r.size() ; i++){
            twosToOne.add(r.get(i));
            twosToOne.add(r.get(i));
        }
        return twosToOne;
    }
}