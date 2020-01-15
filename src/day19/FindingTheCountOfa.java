package day19;

public class FindingTheCountOfa {

    public static void main(String[] args) {

        String name = "Okan Dogan";

        int countOfaAndA=0;

        for (int x = 0; x < name.length(); x++) {

            char currentChar = name.charAt(x);

            if ( currentChar == 'a') {
                ++countOfaAndA;

            }
        }
        System.out.println(countOfaAndA);

    }
}
