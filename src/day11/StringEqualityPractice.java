package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

        /* Checking equality always should be done using equals method of string
        *  oneString.equals(anotherString) ---->> true or false
        *
        * */

        //System.out.println( "Java".equals("java")); // that is sth that will be used rarely

        String myStr = "Java";

        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");
        System.out.println("Is my string same as your string?");
        System.out.println(myStr.equals(yourStr));

        if (myStr.equals(yourStr)){
            System.out.println("Correct Word");
        } else {
            System.out.println("Say JAVA");
        }



    }
}
