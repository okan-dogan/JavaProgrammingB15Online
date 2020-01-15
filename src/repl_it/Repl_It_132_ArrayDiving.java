package repl_it;
/*
In the sport of diving, seven judges award a score between 0 and 10,
where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points.
The total is then multiplied by 0.6 to determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
output: Enter score for judge 1:
input: 1
output: Enter score for judge 2:
input: 5
output: Enter score for judge 3:
input: 5
output: Enter score for judge 4:
input: 5
output: Enter score for judge 5:
input: 5
output: Enter score for judge 6:
input: 8
output: Enter score for judge 7:
input: 9
output: Enter difficulty:
input: 2.1
output: Total: 35.28
 */

/*
This method has a kind of bug;
When you enter more than one min or max it burns
 */
import java.util.Arrays;
import java.util.Scanner;

public class Repl_It_132_ArrayDiving {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        for (int i = 0; i <7 ; i++) {
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i]= input.nextFloat();
        }

        System.out.println("Enter difficulty:");
        float difficultyLevel = input.nextFloat();

        float maxScore = score[0];
        float minScore = score[0];
        for (float eachScore : score) {
            if(eachScore>maxScore){
                maxScore=eachScore;
            }
            if(eachScore<minScore){
                minScore=eachScore;
            }
        }

        float totalScore=0,total=0;
        for (int i = 0; i <score.length ; i++) {
            if(score[i]==maxScore||score[i]==minScore){
                continue;
            }
            totalScore+=score[i];
        }
        total=totalScore*difficultyLevel*0.6f;


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);



    }
}

