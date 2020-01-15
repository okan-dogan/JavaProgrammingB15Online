package day35;

import java.io.OutputStream;

/*
Character charObject = Character.valueOf('a');
System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a') );
System.out.println("Character.isDigit('7') = "      + Character.isDigit('7'));
System.out.println("Character.isLetter('A') = "     + Character.isLetter('A'));
System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));
System.out.println("Character.isUpperCase('a') = "  + Character.isUpperCase('a'));
System.out.println("Character.isLowerCase('b') = "  + Character.isLowerCase('b'));
System.out.println("Character.toUpperCase('a') = "  + Character.toUpperCase('a'));
System.out.println("Character.toLowerCase('A') = "  + Character.toLowerCase('A'));
 // "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF"
Try out above Character methods given to you and try to solve the problem of extracting the number out of the string
 */
public class CharacterPractice {

    public static void main(String[] args) {

        Character charObject = Character.valueOf('a');
        System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a') );
        System.out.println("Character.isDigit('7') = "      + Character.isDigit('7'));
        System.out.println("Character.isLetter('A') = "     + Character.isLetter('A'));
        System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));
        System.out.println("Character.isUpperCase('a') = "  + Character.isUpperCase('a'));
        System.out.println("Character.isLowerCase('b') = "  + Character.isLowerCase('b'));
        System.out.println("Character.toUpperCase('a') = "  + Character.toUpperCase('a'));
        System.out.println("Character.toLowerCase('A') = "  + Character.toLowerCase('A'));

        System.out.println("=======TASK======");
        String str = "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF";
        String nums="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                nums+=str.charAt(i);
            }
        }
        System.out.println(nums);
        Long numm = Long.valueOf(nums);
        System.out.println("numm = " + numm);




    }
}
