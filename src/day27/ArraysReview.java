package day27;

import java.util.Arrays;

public class ArraysReview {

    public static void main(String[] args) {

        int num = 10;
        int[] arr = {10,20,30,40,50,60};
        // I wanna put the last element of the Array into the num1
        // you get the size of array by arr.length, in this scenario it is -->> 6
        // to get last element of the Array, you use index of Array, in this scenario it is -->> 5 (6-1)
        int num1=arr[arr.length-1];
        System.out.println(num1);

        for (int i = 0; i <arr.length ; i++) {   // or i<=arr.length-1
            System.out.print(arr[i]+" ");
        }

        System.out.println(arr); // you cannot get any data but address by using this
                                 // you have to convert it into Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));

    }
}
