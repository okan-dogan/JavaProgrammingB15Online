package repl_it;
/*
Given a square matrix, calculate the absolute difference between the sums of
its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9

The left-to-right diagonal = 1+5+9 = 15.
The right to left diagonal =  3+5+9 = 17.
Their absolute difference is |15-17| = 2.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Repl_It_172_2D_Arrays_Diagonal_Difference {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;
        int fD=0;
        int sD=0;

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j<3 ; j++) {
                if(j==i){
                    fD+=matrix[i][j];
                }
            }
        }

        for (int k = 0; k <3 ; k++) {
            for (int l = 0; l<3 ; l++) {
                if(l+k==2){
                    sD+=matrix[k][l];
                }
            }
        }

        result=fD-sD;

        // FINAL PRINT
        System.out.println(Math.abs(result));
    }

}




