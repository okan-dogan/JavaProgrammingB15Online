package day25;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String sentence = "I love JAVA";

        String[] allWords = sentence.split(" ");
        System.out.println("allWords after split = "+ Arrays.toString(allWords));
        System.out.println("How many word do I have in this sentence? = "+allWords.length);

        System.out.println("Last word in this sentence = "+allWords[allWords.length-1]);

        String sentence2 = "Everything is Awesome!!!";
        System.out.println("sentence2 = " + sentence2);
        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));
        for ( String eachPieces : splitBy_e_Arr ) {
            System.out.println("eachPieces = <" + eachPieces+">");

        }

    }
}
