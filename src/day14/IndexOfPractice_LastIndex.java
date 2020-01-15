package day14;

public class IndexOfPractice_LastIndex {

    public static void main(String[] args) {

        // indexOf-->>
        // find out index of another String inside this String

        String name = "Game of Java"; // length is 12, last char index is 11

        // find out the last location of the letter a shows up
        System.out.println("find out the last location of the letter a shows up");
        System.out.println(name.lastIndexOf("a"));

        // find out the last location of the character 'space' shows up
        System.out.println("find out the last location of the character 'space' shows up");
        System.out.println(name.lastIndexOf(" "));

        // find out the last location of the letter Ga shows up
        System.out.println("find out the last location of the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));

        // find out the last location of the letter Kawa shows up
        System.out.println("find out the last location of the letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));

        /*
        If I don't use contains method
         */

//        if (name.indexOf("Kawa">-1)){
//            System.out.println("KAWA FOUND");
//        }else {
//            System.out.println("NO KAWA - NO PUMPKIN!!!");
//        }

    }
}
