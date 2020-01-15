package day27;

import java.util.Arrays;

public class MultiDimensionalArrays_3D {

    // N dimensional Array must contains (N-1) dimensional arrays

    public static void main(String[] args) {
        // 2D Array contains 1D dimensional array
        int[][] arr2D = { {1,2,3}, {4,5,6} };
        // index             0   ,    1

        // 3D Array contains 2D dimensional array
        int[][][] arr3D = { {{1,2,3}, {4,5,6}} , {{7,8,9}, {10,11,12}} };
        // index   3D                0         ,          1
        // index   2D           0   ,    1     /     0   ,      1
        // index   1D         0,1,2 ,  0,1,2   /   0,1,2 ,   0, 1, 2

        System.out.println("The entire elements of the array is = "+Arrays.deepToString(arr3D));
        System.out.println("The length of the arr3D is = "+arr3D.length);

        // print 9
        System.out.println("Print 9 = "+arr3D[1][0][2]);

        // print 2
        System.out.println("Print 2 = "+arr3D[0][0][1]);

        // print {1,2,3}
        System.out.println("Print {1,2,3} = "+Arrays.toString(arr3D[0][0]));

        // print {10,11,12}
        System.out.println("Print {10,11,12} = "+Arrays.toString(arr3D[1][1]));

    }
}
