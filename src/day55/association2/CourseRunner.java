package day55.association2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {


    public static void main(String[] args) {

//        List<String> lst = new ArrayList<>(Arrays.asList("Muge", "Sumeyye", "Hasan", "Yusuf", "Halit" ));

//        Course java = new Course("Java", lst);
        Course java = new Course("Java", new ArrayList<>(Arrays.asList("Muge", "Sumeyye", "Hasan", "Yusuf", "Halit" )));
        System.out.println("java before adding = " + java);

        java.studentNames.add("Okan");
        java.studentNames.add("Metin");
        java.studentNames.add("Derya");
        java.studentNames.add("Inci");
        java.studentNames.addAll(Arrays.asList("Merve", "Bahar", "Vera"));

        System.out.println("after adding java.studentNames = " + java.studentNames);

        java.addManyStudents(Arrays.asList("Serife", "Israfil", "Toyly"));

        //System.out.println("Course java = \n" + java);
        System.out.println("java.studentNames = " + java.studentNames);

    }




}