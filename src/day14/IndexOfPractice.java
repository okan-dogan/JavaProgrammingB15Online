package day14;

public class IndexOfPractice {

    public static void main(String[] args) {

        // indexOf-->>
        // find out index of another String inside this String
                    // 012345678901
        String name = "Game of Java";
        // find out the location of Java
        // find out the location of letter o
        // find out the location of first space

        /*
        G 0
        a 1
        m 2
        e 3
          4
        o 5
        f 6
          7
        J 8
        a 9
        v 10
        a 11
         */
        System.out.println("Find out the location of 'Java':");
        System.out.println(name.indexOf("Java"));

        System.out.println("Find out the location of 'o':");
        System.out.println(name.indexOf("o"));

        System.out.println("Find out the location of 'O':");
        System.out.println(name.indexOf("O"));  // anytime I get -1, it means 'there is no such a character'
                                                // it is case sensitive

        System.out.println("Find out the location of first 'space':");
        System.out.println(name.indexOf(" "));


    }
}
