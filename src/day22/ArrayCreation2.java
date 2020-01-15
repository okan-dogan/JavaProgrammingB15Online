package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        // you can assign the values like this;
        // int[] ages ;
        //       ages = new int[]{3,5,11,33,77,55,'A'};

        // or you can directly use;
        // int[] ages = {3,5,11,33,77,55,'A'};

        int [] areaCode = {703,300,954,665};
        for (int i = 0; i <areaCode.length ; i++) {
            System.out.print(areaCode[i]+" ");
        }
        System.out.println();

        int[] ages = new int[]{3,5,11,33,77,55,'A'};
        int itemCount = ages.length;
        System.out.println("ages array length is: "+itemCount);

        for (int i = 0; i <ages.length ; i++) {

            System.out.println(ages[i]);

        }



    }
}
