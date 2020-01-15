package day11;

public class StringEqualityPractice2 {

    public static void main(String[] args) {

        String myStr = "Cava";

        System.out.println("Is my string same as your string?");

        if (myStr.equals("Java")){
            System.out.println("Correct Word");
        } else if (myStr.equals("Cava")){
            System.out.println("Pumpkin!!");
        } else {
            System.out.println("Say JAVA");
        }
    }
}
