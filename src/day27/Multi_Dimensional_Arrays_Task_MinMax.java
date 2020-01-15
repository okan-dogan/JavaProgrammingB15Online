package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Task_MinMax {

    public static void main(String[] args) {

        int[][] numbers = { {12,11,10,19}, {19,20,15}, {100,90,89,7888}};
        System.out.println("The entire numbers (2D array) is = "+Arrays.deepToString(numbers));

        int max = numbers [0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]>max){
                    max=numbers[i][j];
                }
            }
        }
        System.out.println("The maximum number in the numbers (2D array) is = "+max);

        int secondMax = numbers [0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]>secondMax&&numbers[i][j]!=max){
                   secondMax=numbers[i][j];
                }
            }
        }
        System.out.println("The second maximum number in the numbers (2D array) is = "+secondMax);

        int min = numbers [0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]<min){
                    min=numbers[i][j];
                }
            }
        }
        System.out.println("The minimum number in the numbers (2D array) is = "+min);

        int secondMin = numbers [0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]==min){
                    continue;
                }
                // you can also use && condition here
                if(numbers[i][j]<secondMin){
                    secondMin=numbers[i][j];
                }
            }
        }
        System.out.println("The second minimum number in the numbers (2D array) is = "+secondMin);






    }
}
