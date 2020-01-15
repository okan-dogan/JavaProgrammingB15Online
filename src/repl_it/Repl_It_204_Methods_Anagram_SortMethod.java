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


import java.util.Arrays;

public class Repl_It_204_Methods_Anagram_SortMethod {

    public static void main(String[] args) {
        System.out.println(isAnagram("java","cava"));
    }

    public static boolean isAnagram(String word1, String word2) {
        char[] newWord1 = word1.toUpperCase().toCharArray();
        char[] newWord2 = word2.toUpperCase().toCharArray();
        Arrays.sort(newWord1);
        Arrays.sort(newWord2);
        if(Arrays.equals(newWord1,newWord2)){
            return true;
        }
        return false;
    }


}




