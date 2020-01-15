package office_hour;

import java.util.Arrays;

public class Practice_12_12 {

    public static void main(String[] args) {

        int[] arr = {1,2,3}; // it's size is 3 you can also write int[] arr = new int[3]
                             // and then initialize the values of the array

        arr=new int[4]; // if I resize the array, I lose my former values and I get 0 as default values

        System.out.println("After resizing the Array my default values become = "+ Arrays.toString(arr));

        String[] names = new String[5];
                 names[2]="Okan";
                 names[4]="Derya";
        System.out.println(Arrays.toString(names));
        // I get null as default value for uninitialized String Array

        int[] nums = new int[7];  // Array length is 7 (size, capacity), and the highest index is 6
            //nums[7]=10; // gives error ; Array,IndexOutOfBoundsException

        char[] characters = {'a','b','c','d'};
        String str1=Arrays.toString(characters);
        System.out.println("str1 = " + str1);
        System.out.println("The first character of String str1 charAt(0) = "+str1.charAt(0));

        int[] scores = {10,9,8,7,6,5,4,3,2,1};
        Arrays.sort(scores);
        System.out.println("scores after sorting (ascending) = " + Arrays.toString(scores));

        String[] chars = "ABCD".split("");
        System.out.println("chars after splitting by \""+"\" "+Arrays.toString(chars));

        char[] chars2="Vald".toCharArray();
        System.out.println("chars2 after .toCharArray() = " + Arrays.toString(chars2));

        // write a program that can print out the unique values from an int Array

        int[] numbers = {1,1,2,2,3,4,4,5,5};



        for (int i = 0; i <numbers.length ; i++) {
            int count=0;
            for (int j = 0; j <numbers.length ; j++) {
                if (numbers[i]==numbers[j]){
                    count++;                            // every comparision gives count==2
                                                        // only unique character gives count==1
                }
            }

            if(count==1){
                System.out.println("My unique integer in int Array is = "+numbers[i]);
            }
        }


        // write a program that can print out the unique values from an String Array

        String[] array = {"A","A","B","C","C"}; // if I added "D","E","F", I would also get these
        for (int i = 0; i <array.length ; i++) {
            int count2 = 0;
            for (int j = 0; j <array.length ; j++) {
                if(array[i]==array[j]){
                    count2++;
                }
            }
            if(count2==1){
                System.out.println("My unique character in String Array is = " + array[i]);
            }
        }

        // write a program that can find second max number from an int array DO NOT use sort method

        int[] grades = {1,2,3,4,5,6,7,8,9};

        int firstMax = grades[0];
// you can use both fori and foreach to find first and second max
//        for (int i = 0; i <grades.length ; i++) {
//            for (int j = 0; j <grades.length ; j++) {
//                if(grades[i]>firstMax){
//                    firstMax=grades[i];
//                }
//            }
//        }

        for (int eachGrade : grades) {
            if(eachGrade>firstMax){
                firstMax=eachGrade;
            }
        }

        System.out.println("First Maximum Number in grades array is = " + firstMax);

        int secondMax = grades[0];
// you can use both fori and foreach to find first and second max
//        for (int i = 0; i <grades.length ; i++) {
//            for (int j = 0; j <grades.length ; j++) {
//                if(grades[i]==firstMax){
//                    continue;
//                }else if(grades[i]>secondMax){
//                    secondMax=grades[i];
//                }
//            }
//        }

        for (int eachGrade : grades) {
            if(eachGrade==firstMax){
                continue;
            }else if(eachGrade>secondMax){
                secondMax=eachGrade;
            }
        }
        System.out.println("Second Maximum Number in grades array is = " + secondMax);



        // Swap two variable values without using a temporary variable
        int a=10, b=20;
            // expected result is a=20 , b=10
         a = a+b; // a = 30
         b = a - b; // b = 30 - 10 = 20
         a = a - b; // a = 30 - 20 = 10

        System.out.println("a = "+a+", and b = "+b);






    }
}
