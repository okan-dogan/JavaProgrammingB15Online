package day22;

public class LoopingThroughAnArray {

    public static void main(String[] args) {

        // creating an array object with empty slot
        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
        // accessing the elements inside array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println();

        // to find the size of an array you use length Property "NOT method length();"
        int itemCount = scores.length;
        int lastItemIndex = itemCount-1;
        System.out.println("'scores' array's length is : "+itemCount); // 4

        for (int i = 0; i <itemCount ; i++) { // you can also use i<=lastItemIndex
            System.out.println(scores[i]);


        }


    }
}
