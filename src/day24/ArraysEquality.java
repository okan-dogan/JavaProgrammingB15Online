package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {

        int[] scores1 = {2,5,6,7,3,34,6};
        int[] scores2 = {22,45,6,37,3,6,9};
        int[] scores3 = {2,5,6,7,3,34,6};
        int[] scores4 = {5,6,7,3,2,34,6}; // it has the same number as score1 and score3 but its sequence is different

        System.out.println(scores1==scores2);  // false
        System.out.println(scores1==scores3);  // false
        // just like as String they are not compare by ==
        // you should use Array.equals(array1,array2); true or false

        boolean isS1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println("Does score1 have the same content of score2? " + isS1S2Equals);

        boolean isS1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println("Does score1 have the same content of score3? " + isS1S3Equals);

        boolean isS3S4Equals = Arrays.equals(scores3,scores4);
        System.out.println("Does score3 have the same content of score4? " + isS3S4Equals);

        System.out.println("Compare the equality, after sorting score3 and score4");
        Arrays.sort(scores3);
        Arrays.sort(scores4);
        isS3S4Equals = Arrays.equals(scores3,scores4);
        System.out.println("Does score3 have the same content of score4 after sorting them? " + isS3S4Equals);


    }
}
