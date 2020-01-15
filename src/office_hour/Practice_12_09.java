package office_hour;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice_12_09 {

    public static void main(String[] args) {

        int num = 9;
        num = 15;

        int[] nums = new int[4];
        nums[0]=5;
        nums[1]=num;
        nums[2]=25;
        nums[3]=22;

        System.out.println(Arrays.toString(nums));
        System.out.println("How many numbers in Array? = "+nums.length);
        System.out.println(nums[1]);
        System.out.println("Last value of the Array = "+nums[nums.length-1]);
        System.out.println("Middle value of the Array = "+nums[(nums.length)/2]);

        int firstMax = nums[0];
        int secondMax=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>firstMax){
                firstMax=nums[i];
            }
            if(nums[i]>secondMax && firstMax>nums[i]){
                secondMax=nums[i];
            }
        }
        System.out.println("Max value of the Array is "+firstMax);
        System.out.println("Second Max value of the Array is "+secondMax);


        //to find second max number





    }
}
