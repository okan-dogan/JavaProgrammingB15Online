package repl_it;
/*
Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]
 */


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl_It_207_Methods_SwitchElement_Array {

    public static void main(String[] args) {
        int[] testLst = new int[]{7,2,3,5};


        System.out.println(Arrays.toString(do_switch(testLst)) );
    }

    public static int[] do_switch(int[] i) {
        int temp = 0;

        temp=i[0];
        i[0]=i[i.length-1];
        i[i.length-1]=temp;

        return i;

    }
}











