package day25;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {
// pick up your own name and turn in into char array and use for each loop to loop over them
// optionally count how many a you have in your name

        String myName = "Okan Dogan";
        int counter=0;
        char[] myNameCharArr = new char[myName.length()];
        for (int i = 0; i <myName.length() ; i++) {
            myNameCharArr[i]=myName.charAt(i);
            if(myNameCharArr[i]=='a'){
                counter++;
            }
        }
        System.out.println("My name Char Array is (after converting to String) = "+Arrays.toString(myNameCharArr));
        System.out.println("My name has "+counter+" 'a' in it.");
        System.out.println();

        char[] myNameCharArr2=myName.toCharArray();
        for (char eachChar : myNameCharArr2) {
            System.out.println(eachChar);
        }
        System.out.println();

        Arrays.sort(myNameCharArr2);
        System.out.println("My name Char Array 2 after sorting = "+ Arrays.toString(myNameCharArr2));




    }
}
