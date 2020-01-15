package day26;

import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args) {

        String name1 = "Okan";
        String name2 = "Derya";

        System.out.println("name1 = "+name1+" and name2 = "+name2);

        String tempContainer = name1;
        name1=name2;
        name2=tempContainer;

        System.out.println("After swapping; name1 = "+name1+" and name2 = "+name2);


        // swap the value of first item and last item
        // there is also a way without using tempContainer 12_12 office hour muhtar explained
        int[] myNumbers = new int[]{10,40,30,7};
        System.out.println("myNumbers = "+Arrays.toString(myNumbers));

        int tempNum = myNumbers[0];
        myNumbers[0]=myNumbers[myNumbers.length-1];
        myNumbers[myNumbers.length-1]=tempNum;

        System.out.println("After swapping the first and the last values = " + Arrays.toString(myNumbers));

    }
}
