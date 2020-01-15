package day27;

/* single dimensional array contains values
   int [] arr = {1,2,3};

   multi dimensional array: an array that can contain array(s)
   N dimensional Array must contain N-1 Array

   ex: 2 dimesional array: conatins 1 dimesional arrays
   int[][] arr2D = { {1,2,3 } , {4, 5, 6 }   }

*/


import java.util.Arrays;

public class Multi_Dimensional_Arrays_Intro {

    public static void main(String[] args) {

        int[] arr1D = {1,2,3};
        // in here [] brackets represents index num of element
        // arr1D[0]=1
        System.out.println("Entire Array of arr1D = "+Arrays.toString(arr1D));

        // 2D array is an array that contains single dimensional arrays (N-1) N=dimension number
        int [][] arr2D = { {1,2,3}, {4,5,6} };
                   //index    0        1
                   // arr2D[0] = {1,2,3}
        // the first brackets represent index num of 1D array
        // the second brackets represent index num of elements
        System.out.println(arr2D.length);  // -->> 2
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        // arr2D[0][2] ==>> 3 "index 0 = 1,2,3", "index 0 2 = 3"
        System.out.println(arr2D[0][2]);

        // print 5
        System.out.println(arr2D[1][1]);

        System.out.println(arr2D);
        // it gives error showing only the address of memory

        System.out.println("With Arrays.toString method the entire Array of arr2D = "+Arrays.toString(arr2D));
        // Arrays.toString is only applicable for single dimensional array

        System.out.println("With Arrays.deepToString the entire Array of arr2D = "+Arrays.deepToString(arr2D));
        // if you want to get the whole array data you have to use Arrays.deepToString(arr2D)






    }
}
