package day29;

import java.util.Arrays;

public class Task_ILoveJAVA300 {

    public static void main(String[] args) {

        String[] arrLove = new String[300];

        for (int i = 0; i <arrLove.length ; i++) {
            arrLove[i] = (i+1) + ". I love JAVA";
        }
        System.out.println(Arrays.toString(arrLove));

    }
}
