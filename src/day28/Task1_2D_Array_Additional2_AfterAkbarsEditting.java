package day28;

//        2, Write a program to search a value in excel and print the all location of the value :
//        for example : 67 --> Cell(4,1)  Cell(4,4) Cell(6,1)

//        Cell(1,1)= 78	Cell(1,2)= 54	Cell(1,3)= 100	Cell(1,4)= 84
//        Cell(2,1)= 33	Cell(2,2)= 44	Cell(2,3)= 77	Cell(2,4)= 123
//        Cell(3,1)= 12	Cell(3,2)= 88	Cell(3,3)= 52	Cell(3,4)= 76
//        Cell(4,1)= 67	Cell(4,2)= 33	Cell(4,3)= 98	Cell(4,4)= 67
//        Cell(5,1)= 12	Cell(5,2)= 88	Cell(5,3)= 52	Cell(5,4)= 45
//        Cell(6,1)= 67	Cell(6,2)= 33	Cell(6,3)= 98	Cell(6,4)= 34


import java.util.Arrays;
import java.util.Scanner;

public class Task1_2D_Array_Additional2_AfterAkbarsEditting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number=0;
        int [][] arr2D = { {78,54,100,58}, {33,44,77,123}, {12,88,52,76}, {67,33,98,67}, {12,88,52,45}, {67,33,98,34}    };

        System.out.println("Please enter the number:");
        number=scan.nextInt();

        int counter=0;
        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
                if(arr2D[i][j]==number){
                        counter++;
                        System.out.print("Cell("+(i+1)+","+(j+1)+")"+"   ");
                }
            }
        }
        if (counter==0){
            System.out.println("The number doesn't exist");
        }






    }
}
