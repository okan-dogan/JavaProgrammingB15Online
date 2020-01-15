package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {

    public static void main(String[] args) {

        String[][] names = {  {"Okan","Derya","YusufHalit","Inci"}, {"Metin","Merve","Bahar","Vera"}   };
                //first index                  0                   ,                   1
                //second index   0   ,   1   ,     2       ,   3   /     0    ,   1  ,   2   ,  3

        // print YusufHalit
        System.out.println(names[0][2]);

        // print Vera
        System.out.println(names[1][3]);

        // change YusufHalit as Yusuf Halit and print
        names[0][2]="Yusuf Halit";
        System.out.println(names[0][2]);

        // print dogan family
        System.out.println("Only Dogan family is = "+Arrays.toString(names[0]));

        // print the whole names
        System.out.println("The whole names in the Array is = "+Arrays.deepToString(names));

        int[][] numbers = { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12,13} };
        //                     0   ,    1   ,    2   ,       3
        //  numbers.length ==>> 4
        System.out.println("The entire array "+Arrays.deepToString(numbers));
        for (int i = 0; i <numbers.length ; i++) {               // checks each index of two dimensional
            //System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j <numbers[i].length ; j++) {        // checks each elements of single
                System.out.println(numbers[i][j]);
            }
        }
        System.out.println();

        //

        int[][] ages = { {10}, {12,13,14,16,17}, {19,20,21,22,23} };
        String evenAges="";

        for (int i = 0; i <ages.length ; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                if(ages[i][j]%2!=0){
                   continue;
                }
                evenAges+=ages[i][j]+" ";
            }
        }
        System.out.println("Even ages in the array is = "+evenAges);


        System.out.println("\n==========================");

        int[] arr1D={1,2,3};

        for (int each : arr1D) {
            System.out.print(each+" ");
        }
        System.out.println("\n==========================");

        int[][] arr2D = { {10,20,30}, {40,50,60,70,80,90,100}  };

        for (int[] each1DArray: arr2D) {            // variable name each1DArray represents each inbdex of the 2d array
            for (int eachElement : each1DArray) {   // variable name eachElement represents each element that's contain in the 2d array
                System.out.println("Each element of the arr2D is = "+eachElement);
            }
        }










    }

}

