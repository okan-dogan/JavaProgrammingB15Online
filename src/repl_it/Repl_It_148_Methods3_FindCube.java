package repl_it;

import java.util.Scanner;

/*
Given method called cube. Write all required code inside this method
in order to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
*/
public class Repl_It_148_Methods3_FindCube {

    public static void main(String[] args) {

        cube();
    }

    public static void cube() {
        //your code here

        Scanner scan = new Scanner (System.in);
        int input = scan.nextInt();
        System.out.println(input*input*input);

    }//end cube


}
