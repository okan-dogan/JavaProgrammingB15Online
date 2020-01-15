package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        printArrayItems(new int[]{1,6,5,3,12,3});

        int [] scores = {2,5,8,23,4,5,6};
        printArrayItems(scores);

        printArrayMax(new int[]{1,6,5,3,12,3});
        printArrayMin(new int[]{1,6,5,3,12,3});
        printArrayMax(scores);
        printArrayMin(scores);

        printSumOfIntArray(scores);

        compare2arraySize(new String[]{"Sezgin", "Senay", "Astrit"}, new String[]{"Araz"});
        String[] names1 = {"Superman", "Batman", "Flash"};
        String[] names2 = {"Wonder Woman", "Cyborg", "Aquaman"};

        compare2arraySize(names1, names2);

    }

    /* array printer
    create a method that has one int array as a parameter
    print each item in this format
    array has items ;---->>> all the items here
     */

    public static void printArrayItems (int[] nums){
        System.out.println("array has items ;---->>> "+ Arrays.toString(nums));
    }

    public static void printArrayMax(int[] nums){
        int max = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("This array consists of "+Arrays.toString(nums));
        System.out.println("Maximum number of this array is = "+max);
    }

    public static void printArrayMin(int[] nums){
        int min = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("This array consists of "+Arrays.toString(nums));
        System.out.println("Minimum number of this array is = "+min);
    }


    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers
    public static void printSumOfIntArray(int[] nums) {

        int sum = 0;
        for (int each : nums) {
            sum = sum + each;  //sum+=each ;
        }
        System.out.println("sum = " + sum);
    }


    public static void compare2arraySize(String[] arr1, String[] arr2) {

        if (arr1.length > arr2.length) {
            System.out.println("array 1 has more item ");
        } else if (arr1.length < arr2.length) {
            System.out.println("array 2 has more item ");
        } else {
            System.out.println("they have same item count");
        }

    }


    // OPTIONALLY
    // checkScoresAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether all the numbers are more than 60
    // if so print everyone passed
    // if not print someone has failed

}
