package day27;

import java.util.Arrays;

public class MultiDimensionalArrays_3D_Practice {

    public static void main(String[] args) {

        int[][][] arr3D = { {{1,2,3}, {4,5,6}} , {{7,8,9}, {10,11,12}} };
        // index   2D                0         ,          1
        // index   1D           0   ,    1     /     0   ,      1
        // index elements     0,1,2 ,  0,1,2   /   0,1,2 ,   0, 1, 2

        System.out.println("==================");
        System.out.println("With for method;");
        for (int i = 0; i <arr3D.length ; i++) {                  // each index of 2D array
            for (int j = 0; j <arr3D[i].length ; j++) {           // each index of 1D array
                for (int k = 0; k <arr3D[i][j].length ; k++) {    // each elements of the arrays
                    System.out.print(arr3D[i][j][k]+"  ");
                }
            }
        }

        System.out.println("\n==================");
        System.out.println("With for each method;");

        for (int[][] each2DIndex : arr3D) {
            for (int[] each1DIndex : each2DIndex) {
                for (int eachElement : each1DIndex) {
                    System.out.print(eachElement+"  ");
                }
            }
        }



    }
}
