package repl_it;
/*
Complete a void method printUniqueNumbers()
that will print all unique numbers from an array of ints.
Every single unique int should be printed from the new line.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */

import java.util.Scanner;

public class Repl_It_174_Methods14_Print_Unique {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int i = 0; i <nums.length ; i++) {
            int counter = 0;
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    counter++;
                }
            }
            if(counter==1){
                System.out.println(nums[i]);
            }
        }


    }
}




