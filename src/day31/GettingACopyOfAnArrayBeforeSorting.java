package day31;
/*
You had better get a copy of an Array by using for loop before sorting it.
Because you can need the previous one at somepoint.
 */
import java.util.Arrays;

public class GettingACopyOfAnArrayBeforeSorting {

    public static void main(String[] args) {

        String[] str={"Okan","Derya","Yusuf Halit","Inci"};

        String[] strCopy=new String[str.length];

        for (int i = 0; i <str.length ; i++) {
            strCopy[i]=str[i];
        }
        System.out.println("str equals "+Arrays.toString(str));
        System.out.println("strCopy equals "+Arrays.toString(strCopy));
        Arrays.sort(str);
        System.out.println("After sorting str equals "+Arrays.toString(str));
        /*
        After this point (After sorting the Array) you cannot use the original str as the previous one.
        So, your copy can be used as the original one.
         */

    }

}
