package repl_it;
/*
Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.
 */


import java.util.ArrayList;
import java.util.Arrays;

public class Repl_It_202_Methods_ArrayList_timesTwo {

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        timesTwo(test);
    }

    public static void timesTwo (ArrayList<Integer> nums){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int total = 0;
        for (int i = 0; i <nums.size() ; i++) {
            nums.set(i,nums.get(i)*2) ;
        }
        System.out.println(nums);
    }


}




