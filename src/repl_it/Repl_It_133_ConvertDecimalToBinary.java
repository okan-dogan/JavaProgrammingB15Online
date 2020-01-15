package repl_it;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

/*
Binary number is a number expressed in the base-2 numeral system or binary numeral system,
which uses only two symbols: typically 0 (zero) and 1 (one). Each digit is referred to as a bit.

Given an int variable decimal,
write java program to calculate binary value of the decimal variable and assign it binary array.
print out value of binary array matching below format. Feel free to use additional arrays or formulas.

Example:
decimal -> 3
binary -> [0, 0, 0, 0, 0, 0, 1, 1]

decimal -> 35
binary -> [0, 0, 1, 0, 0, 0, 1, 1]

decimal -> 255
binary -> [1, 1, 1, 1, 1, 1, 1, 1]
 */
public class Repl_It_133_ConvertDecimalToBinary {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 255 to get a binary code of your number!");

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.

        if(decimal<=255){
            for(int i=7;i>=0;i--){
                binary[i]=decimal%2;
                decimal/=2;
            }
        }else{
            System.out.println("Invalid input");
        }
        System.out.println(Arrays.toString(binary));






    }
}
