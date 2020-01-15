package repl_it;
/*
Reverse a string without affecting special characters
Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.


Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

Input:   str = "----qwe--r--tyf...gd.---"
Output:  str = "----dgf--y--tre...wq.---"
 */


import java.util.ArrayList;

public class Repl_It_210_Methods_ReverseLetters {

    public static void main(String[] args) {

        String result = reverseLetters("..zxcv..d");
        System.out.println(result.equals("..dvcx..z")); //true

        String result2 = reverseLetters("---abmkl.o-");
        System.out.println(result2.equals("---olkmb.a-")); //true

        String result3 = reverseLetters("---abmkl.o-");
        System.out.println(result3.equals("-o.lkmba---")); //false
    }

    public static String reverseLetters(String word) {

        String resultChars = "";
        String result = "";

        for (int i = 0; i <word.length() ; i++) {
            if(Character.isLetter(word.charAt(i))){
                resultChars+=""+word.charAt(i);
            }
        }

        for (int i = 0, j = resultChars.length()-1; i < word.length() ; i++) {
            if(Character.isLetter(word.charAt(i))){
                result+=resultChars.charAt(j);
                j--;
            }else{
                result+=""+word.charAt(i);
            }
        }
        word=result;
        return word;

    }
}











