package day27;

import java.util.Arrays;

public class ArrayReviewTask2_MinNumbers {

    public static void main(String[] args) {

// write a program that can find the min number of an array
// DO NOT use sort method
// and find the second min
// and then find the third min

        int[] scores = {100,897,654,32,1231,224,556,7,1,2,3,4};
        int min = scores[0];

        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]<min){
                min=scores[i];
            }

        }
        System.out.println("Scores Array consists of "+Arrays.toString(scores));
        System.out.println("Minimum number of the Array is = " + min);

        int secondMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]==min){
                continue;
            }

// you can also use this logic to get the secon min.
// but in the interview continue is recommended to use

//            if(scores[i]<secondMin&&scores[i]!=min){
//                secondMin=scores[i];
//            }

        }
        System.out.println("The second minimum number of the Array is = " + secondMin);

        int thirdMin = scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]==min||scores[i]==secondMin){
                continue;
            }

// you can also use this logic to get the secon min.
// but in the interview continue is recommended to use

//            if(scores[i]<thirdMin&&scores[i]!=min&&scores[i]!=secondMin){
//                thirdMin=scores[i];
//            }

        }
        System.out.println("The third minimum number of the Array is = " + thirdMin);


    }
}
