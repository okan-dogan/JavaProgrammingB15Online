package day13;

public class TestStringStartWithOrEndWith {

    public static void main(String[] args) {

        String name = "Muge";

        // check wheather a string start with another string
        System.out.println(name.startsWith("M"));
        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("Mug"));
        System.out.println(name.startsWith("Muge"));
        System.out.println(name.startsWith("m"));
        System.out.println(name.startsWith("K"));



        // check wheather a string end with another string
        System.out.println(name.endsWith("e"));
        System.out.println(name.endsWith("ge"));
        System.out.println(name.endsWith("uge"));
        System.out.println(name.endsWith("Muge"));
        System.out.println(name.endsWith("E"));
        System.out.println(name.endsWith("A"));


    }
}
