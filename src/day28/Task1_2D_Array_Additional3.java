package day28;

//        3, Write a program to ask user for column number and print only that column data :
//        for example : 2 -->  54 , 44 , 88 , 33 , 88 , 33

//        Cell(1,1)= 78	Cell(1,2)= 54	Cell(1,3)= 100	Cell(1,4)= 84
//        Cell(2,1)= 33	Cell(2,2)= 44	Cell(2,3)= 77	Cell(2,4)= 123
//        Cell(3,1)= 12	Cell(3,2)= 88	Cell(3,3)= 52	Cell(3,4)= 76
//        Cell(4,1)= 67	Cell(4,2)= 33	Cell(4,3)= 98	Cell(4,4)= 67
//        Cell(5,1)= 12	Cell(5,2)= 88	Cell(5,3)= 52	Cell(5,4)= 45
//        Cell(6,1)= 67	Cell(6,2)= 33	Cell(6,3)= 98	Cell(6,4)= 34


import java.util.Arrays;
import java.util.Scanner;

public class Task1_2D_Array_Additional3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int colNum=0;
        int [][] arr2D = { {78,54,100,84}, {33,44,77,123}, {12,88,52,76}, {67,33,98,67}, {12,88,52,45}, {67,33,98,34}    };

        String result= "";

        System.out.println("Please enter the column number:");
        colNum=scan.nextInt();
        while(!(colNum==1 || colNum==2 || colNum==3 || colNum==4)){
            System.out.println("INVALID! There are only 4 column");
            System.out.println("Please enter the row number again:");
            colNum=scan.nextInt();
        }
        System.out.print(colNum+" -->  ");

        for (int i = 0; i <arr2D.length ; i++) {
            result+=arr2D[i][colNum-1]+", ";
        }
        System.out.println(result.substring(0,result.length()-2));

    }
}
