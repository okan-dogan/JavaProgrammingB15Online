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


public class Repl_It_204_Methods_Anagram_testCivan {

    public static void main(String[] args) {
        System.out.println(isAnagram("okaannt","okaantt"));
    }

    public static boolean isAnagram(String word1, String word2) {

        word1= word1.toLowerCase().replace(" ","");
        word2=word2.toLowerCase().replace(" ","");

        boolean isAnagram=true;
        if(word1.length()!=word2.length()){
            isAnagram=false;
        }
        else{
            for (int x = 0; x <word1.length() ; x++) {
                if(!word2.contains(""+word1.charAt(x))){
                    isAnagram=false;
                }
            }
        }
        return isAnagram;
    }



}




