package repl_it;
/*
Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g.,
madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive.  ex: Civic and civic are both palindromes
- make your conditions space insensitive.
Race car is a palindrome even though there is space in between.

Examples:

isPalindrome("Noon") ==> true

isPalindrome("I am not palindrome") ==> false

isPalindrome("wooden") ==> false

isPalindrome("Nurses Run") ==> true
 */


import java.util.ArrayList;

public class Repl_It_204_Methods_Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("oklkalnl","nalkkokl"));
    }

    public static boolean isAnagram(String word1, String word2) {
        char[] newWord1 = word1.replace(" ","").toUpperCase().toCharArray();
        char[] newWord2 = word2.replace(" ","").toUpperCase().toCharArray();
        String sameChars1="";
        String sameChars2="";
        int counter1=0;
        int counter2=0;


        if(newWord1.length==newWord2.length){
            counter1=0;
            for (int i = 0; i <newWord1.length ; i++) {
                for (int j = 0; j <newWord1.length ; j++) {
                    if(newWord1[i]==newWord2[j]){
                        counter1++;
                    }
                }
                if(counter1==0){
                    return false;
                }
            }

            for (int i = 0; i <newWord1.length ; i++) {
                counter2=0;
                for (int j = 0; j <newWord1.length ; j++) {
                    if(newWord2[i]==newWord1[j]){
                        counter2++;
                    }
                }
                if(counter2==0){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }





    }


}




