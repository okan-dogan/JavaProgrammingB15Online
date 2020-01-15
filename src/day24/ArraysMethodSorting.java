package day24;

import java.util.Arrays;

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int[] scores = {99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));
        // for sorting an array in ascending order
        // sort --->> Arrays.sort(yourArrayHere)
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        // SO WHAT HAPPENED TO MY ORIGINAL ORDER??? GONE!!!
        // CAN I GET IT BACK ? NO !!!

        System.out.println();
        char[] nameChars = {'G',' ','d','Z','9','A'};
        System.out.println(Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println(Arrays.toString(nameChars));
        // it is sorted ccording to ascii code sequence

        System.out.println("---------- String sorting ------------");
        // ONLY FIRST CHARACTER MATTER WHEN SORTING A STRING ARRAY
        String[] superHeros = {"Superwoman", "Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash", "100", "9", "09"};
        System.out.println("before sorting superHeros = " + Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting superHeros = " + Arrays.toString(superHeros));

        System.out.println("---------- boolean sorting -----SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY-------");
        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));
        //Arrays.sort(fiveSwitchOnOffs); DOES NOT WORK FOR BOOLEAN ARRAY !!

        // Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action to reshuffle the index of original array object to keep it in sorted order


    }
}
