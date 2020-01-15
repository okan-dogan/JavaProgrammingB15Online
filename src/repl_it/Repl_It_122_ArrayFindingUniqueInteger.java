package repl_it;
/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.

Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */
import java.util.Scanner;

public class Repl_It_122_ArrayFindingUniqueInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        int counter = 0;
        int uniqeNum = 0;

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    counter++;
                }
            }
            if(counter==1){
                uniqeNum=nums[i];
            }else{
                counter=0;
            }
        }
        System.out.println(uniqeNum);





    }
}
