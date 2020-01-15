package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Alesya";

        char[] namesChars = new char[name.length()];

        for (int i = 0; i <namesChars.length ; i++) {
            namesChars[i]=name.charAt(i);
        }
        System.out.println("namesChars = " + Arrays.toString(namesChars));

        char[] namesChars2 = name.toCharArray();
        System.out.println("namesChars2 = " + Arrays.toString(namesChars2));

    }
}
