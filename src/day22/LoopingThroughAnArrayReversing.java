package day22;

public class LoopingThroughAnArrayReversing {

    public static void main(String[] args) {

        int[] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        int itemCount = scores.length;
        int lastItemIndex = itemCount-1;
        System.out.println("'scores' array's length is : "+itemCount); // 4

        for (int i = lastItemIndex; i >=0 ; i--) {
            System.out.println(scores[i]);


        }
    }
}
