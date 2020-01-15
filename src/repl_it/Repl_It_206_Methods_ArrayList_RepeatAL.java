package repl_it;
/*
Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans

This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)
 */


import java.util.ArrayList;

public class Repl_It_206_Methods_ArrayList_RepeatAL {

    public static void main(String[] args) {
        ArrayList<Boolean> testLst = new ArrayList<>();
        testLst.add(false);
        testLst.add(true);
        testLst.add(true);

        repeatAL(testLst);
        System.out.println(testLst);
    }

    public static void repeatAL (ArrayList<Boolean> booleanLst){
        booleanLst.addAll(booleanLst);
    }







}




