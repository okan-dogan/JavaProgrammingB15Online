package day15;

public class Reversing_LordOfTheRing {
    public static void main(String[] args) {

        String movieName = "Lord of The Ring";

        //TASK reverse Lord of The Ring into Ring of The Lord

        String partLord = movieName.substring(0,4);
        String partOfThe = movieName.substring(4,12);
        String partRing = movieName.substring(12); // it takes from 12 to including the last index
        String ringOfTheLord = partRing+partOfThe+partLord;
        System.out.println("ringOfTheLord = " + ringOfTheLord);

        // turn into this Ring of The JAVA Lord
        String ringOfTheJavaLord = partRing+partOfThe+"Java "+partLord;
        System.out.println("ringOfTheJavaLord = " + ringOfTheJavaLord);
    }
}
