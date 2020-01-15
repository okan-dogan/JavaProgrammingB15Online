package day03;

public class CharacterAndBoolean {

    public static void main(String[] args) {

        char grade = 'A';
        char eMailSign = '@';

        char theFirstLetter = 'A';
        char theFirstLetter2 = 65 ;

        // 65 equals A in ASCII alphabet
        // you must use only one character, you cannot put '99' for char

        System.out.println("My score for Math is " + grade);
        System.out.println("My email address is okan" + eMailSign + "gmail.com");

        System.out.println(theFirstLetter);
        System.out.println(theFirstLetter2);

        boolean isLightOn = true;
        System.out.println("Did you turn on the light? " + isLightOn);

        isLightOn = false;
        System.out.println("Did you turn on the light? " + isLightOn);


        boolean areYouSleeping = false;
        boolean isWheatherNice = false;

        System.out.println("Are you sleeping? " + areYouSleeping);
        System.out.println("Is the wheather nice today? " + isWheatherNice);

    }

}
