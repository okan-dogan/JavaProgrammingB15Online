package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {

    public static void main(String[] args) {


        int[] nums = {13,31,8,5,21,2};

        System.out.println("nums = " + Arrays.toString(nums));
        // stroring the size of an array into a variable
        int numsItemCount = nums.length;

        // I want to copy the content of nums array into the new array
        //creating an array with same size as original array
        int[] numsCopy = new int[numsItemCount];
        numsCopy[0]=nums[0]; //13;
        numsCopy[1]=nums[1]; //31;
        numsCopy[2]=nums[2]; //8;
        numsCopy[3]=nums[3]; //5;
        numsCopy[4]=nums[4]; //21;
        numsCopy[5]=nums[5]; //2;

        System.out.println("numsCopy = " + Arrays.toString(numsCopy));
        System.out.println();

        for (int i = 0; i <numsItemCount ; i++) {
            numsCopy[i]=nums[i];
        }
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("numsCopy = " + Arrays.toString(numsCopy));
        System.out.println();

        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy = " + Arrays.toString(numsCopy));

        if(Arrays.equals(nums,numsCopy)){
            System.out.println("This Array is already sorted");
        }else{
            System.out.println("This Array is not sorted");
        }


    }
}
