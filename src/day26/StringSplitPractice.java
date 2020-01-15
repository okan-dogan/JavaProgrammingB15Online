package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";
        // String array called namesArray
        // spell the name of each person (exclude space if you get space in names)
        // A-b-b-o-s-
        // Z-u-l-y-a-r-
        // optionally count a from each name and print
        students=students.replace(" ","");
        String[] namesArray = students.split(",");
        System.out.println(Arrays.toString(namesArray));
        int countOfEach=0;
        for (String eachStudent : namesArray) {
            countOfEach++;
        }
        System.out.println("namesArray Length = " + countOfEach);

//        for (String eachStudent : namesArray) {
//            for (int i = 0; i <= eachStudent.length()-1 ; i++) {
//                System.out.print(eachStudent.charAt(i)+"-");
//            }
//            System.out.println();
//        }

        int studentCount = namesArray.length;

        for (int x = 0; x < studentCount; x++) {

            String name = namesArray[x];  // Abbos // A-b-b-o-s-
            System.out.println("Spelling = " + name);

            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i) + "-");

            }
            System.out.println();


        }






    }
}
