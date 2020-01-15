package repl_it;
/*
Given an int array of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

Example:
input 1, 2, 3
output: [1, 2]

Example:
input 1,
output: [1]
 */
import java.util.Arrays;
import java.util.Scanner;

public class Repl_It_139_ArrayFrontPiece {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        if(size>=2){
            int [] greaterThan2 = new int[2];
            for (int i = 0; i <=1 ; i++) {
                greaterThan2[i]=num[i];
            }
            System.out.println(Arrays.toString(greaterThan2));

        }else{
            int [] smallerThan2 = new int[size];
            for (int i = 0; i <=size-1 ; i++) {
                smallerThan2[i]=num[i];
            }
            System.out.println(Arrays.toString(smallerThan2));
        }




    }
}
