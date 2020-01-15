package day27;

import java.util.Arrays;

public class ArrayReviewTask3_MaxNumbers {

    public static void main(String[] args) {

// write a program that can find the min number of an array
// DO NOT use sort method
// and find the second min
// and then find the third min

        int[] nums = {100,10000,9999,8888,1231,2345};

        int max=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Nums Array consists of "+ Arrays.toString(nums));
        System.out.println("Maximum number of the Array is = " + max);

        int secondMax=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>secondMax&&nums[i]!=max){
                secondMax=nums[i];
            }
// you can also use "if nums[i]==max continue;"
        }
        System.out.println("The second maximum number of the Array is = " + secondMax);

        int thirdMax=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>secondMax&&nums[i]!=max&&nums[i]!=secondMax){
                secondMax=nums[i];
            }
// you can also use "if nums[i]==max && nums[i]==secondMax continue;"
        }
        System.out.println("The third maximum number of the Array is = " + thirdMax);

    }
}
