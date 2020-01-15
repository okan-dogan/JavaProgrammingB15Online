package day20;

public class FindingDogInSentence {

    public static void main(String[] args) {

        String msg = "I like dog, dogs are cute, dogs are friendly";
        int lastCharIndex = msg.length()-1;
        int counter = 0;

        for (int i = 0; i <=lastCharIndex-2 ; i++) {

            String threeLetters = msg.substring(i,i+3);

            if (threeLetters.equalsIgnoreCase("dog")){
                ++counter;
            }

        }
        System.out.println("counter = " + counter);

    }
}
