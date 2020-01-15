package day28;

//      Additional Task on this :
//        1, Write a program to ask user row and column number and return the value in that cell.
//        if it's invalid row or column number , it should print invalid input.
//        for example : row 1 and column 4 has 84
//        row 7 and column 1 -->> INVALID! There are only 6 row and 4 columns
//        Optionally : keep asking user until the user input row and column are not out of range.

//        Cell(1,1)= 78	Cell(1,2)= 54	Cell(1,3)= 100	Cell(1,4)= 84
//        Cell(2,1)= 33	Cell(2,2)= 44	Cell(2,3)= 77	Cell(2,4)= 123
//        Cell(3,1)= 12	Cell(3,2)= 88	Cell(3,3)= 52	Cell(3,4)= 76
//        Cell(4,1)= 67	Cell(4,2)= 33	Cell(4,3)= 98	Cell(4,4)= 67
//        Cell(5,1)= 12	Cell(5,2)= 88	Cell(5,3)= 52	Cell(5,4)= 45
//        Cell(6,1)= 67	Cell(6,2)= 33	Cell(6,3)= 98	Cell(6,4)= 34


import java.util.Scanner;

public class Task1_2D_Array_Additional1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rowNum = 0, colNum=0;
        int [][] arr2D = { {78,54,100,58}, {33,44,77,123}, {12,88,52,76}, {67,33,98,67}, {12,88,52,45}, {67,33,98,34}    };

        System.out.println("Please enter the row number:");
        rowNum=scan.nextInt();
        while(!(rowNum==1 || rowNum==2 || rowNum==3 || rowNum==4 || rowNum==5 || rowNum==6)){
            System.out.println("INVALID! There are only 6 row");
            System.out.println("Please enter the row number again:");
            rowNum=scan.nextInt();
        }

        System.out.println("Please enter the column number:");
        colNum=scan.nextInt();
        while(!(colNum==1 || colNum==2 || colNum==3 || colNum==4)){
            System.out.println("INVALID! There are only 4 column");
            System.out.println("Please enter the row number again:");
            colNum=scan.nextInt();
        }
        System.out.println("Your request is "+arr2D[rowNum-1][colNum-1]);







    }
}
