package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {

    public static void main(String[] args) {

        int[] myNumbers = new int[]{5,1,21,2,3};
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));

        int lastIndex = myNumbers.length-1;
        int temp = 0;
        temp=myNumbers[0];
        for (int i = 0; i <=myNumbers.length-1 ; i++) {
            myNumbers[i]=myNumbers[myNumbers.length-1-i];
        }
        myNumbers[myNumbers.length-1]=temp;
        System.out.println("myNumbers after reversing it = "+Arrays.toString(myNumbers));

    }
}
