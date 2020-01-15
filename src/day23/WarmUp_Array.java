package day23;

import java.util.Arrays;

public class WarmUp_Array {

    public static void main(String[] args) {
//  create an int array of 7 items
//  assign values
// 1,  print out in reverse order
// 2 , store last item in a variable called lastItem
        // print it out separately
// 3 , print the item right in the middle
//
// OPTIONALLY : find sum , find average , find max , find min
// double the value of each item
        int[] warmArray = {15,22,46,95,72,55,62};
        int maxOfWarm = warmArray[0];
        int minOfWarm = warmArray[0];
        int sumOfArray = 0;
        for (int i = warmArray.length-1; i >=0 ; i--) {
            System.out.print(warmArray[i]+" ");
            if(warmArray[i]>maxOfWarm){
                maxOfWarm=warmArray[i];
            }
            if(warmArray[i]<minOfWarm){
                minOfWarm=warmArray[0];
            }
            sumOfArray+=warmArray[i];
        }
        System.out.println();
        System.out.println("The Value of the last index = "+warmArray[warmArray.length-1]);
        System.out.println("The Value of the middle index = "+warmArray[(warmArray.length-1)/2]);
        System.out.println("The MAX Value of the Array = "+maxOfWarm);
        System.out.println("The MIN Value of the Array = "+minOfWarm);
        System.out.println("The sum of the Array = "+sumOfArray);
        System.out.println("The average of the Array = "+sumOfArray/warmArray.length);

        // double each variable in the array
        int doubleArray = 0;
        for (int i = 0; i <warmArray.length ; i++) {
            warmArray[i]*=2;

        }
        System.out.println("The doubled value of each item in Array = "+ Arrays.toString(warmArray));




    }
}
