package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Task_FindingLongestAndShortestName {

    public static void main(String[] args) {

        String[][] names = {  {"Okan","Derya","Yusuf Halit","Inci"}, {"Metin","Merve","Bahar","Vera"}   };

        System.out.println("==================");
        System.out.println("With for method the max character");

        int theLongestIndex = names[0][0].length();
        String theLongestName = names[0][0];

        for (int i = 0; i <names.length ; i++) {
            for (int j = 0; j <names[i].length ; j++) {
               if(names[i][j].length()>theLongestIndex){
                    theLongestIndex=names[i][j].length();
                    theLongestName=names[i][j];
               }
            }
        }
        System.out.println("The longest name in this 2D Array is = "+theLongestName+" and it has "+theLongestIndex+" character!");

        System.out.println("==================");
        System.out.println("With for each method");
        int theLongestIndex1 = names[0][0].length();
        String theLongestName1 = names[0][0];
        for (String[] each1DArray : names) {
            for (String eachName : each1DArray) {
                if(eachName.length()>theLongestIndex1){
                    theLongestIndex1=eachName.length();
                    theLongestName1=eachName;
                }
            }
        }
        System.out.println("The longest name in this 2D Array is = "+theLongestName1+" and it has "+theLongestIndex1+" character!");

        System.out.println("==================");
        System.out.println("With for method the min character");

        int theShortestIndex1 = names[0][0].length();
        String theShortestName1 = names[0][0];

        for (int i = 0; i <names.length ; i++) {
            for (int j = 0; j <names[i].length ; j++) {
                if(names[i][j].length()<theShortestIndex1){
                    theShortestIndex1=names[i][j].length();
                    theShortestName1=names[i][j];
                }
            }
        }
        System.out.println("The shortest name in this 2D Array is = "+theShortestName1+" and it has "+theShortestIndex1+" character!");


        System.out.println("==================");
        System.out.println("With for each method the min character");
        int theShortestIndex = names[0][0].length();
        String theShortestName = names[0][0];
        for (String[] each1DArray : names) {
            for (String eachName : each1DArray) {
                if(eachName.length()<theShortestIndex){
                    theShortestIndex=eachName.length();
                    theShortestName=eachName;
                }
            }
        }
        System.out.println("The shortest name in this 2D Array is = "+theShortestName+" and it has "+theShortestIndex+" character!");










    }
}
