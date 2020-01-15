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


public class Repl_It_204_Methods_Anagram_test {

    public static void main(String[] args) {
        System.out.println(isAnagram("okaannt","okaantt"));
    }

    public static boolean isAnagram(String word1, String word2) {
        String temp1="", temp2="";
        if(word1.length()==word2.length()){
            word1=word1.toUpperCase();
            temp1=word1;
            word2=word2.toUpperCase();
            temp2= word2;
            for (int i = 0; i <word1.length() ; i++) {
                temp2=temp2.replace((""+word1.charAt(i)),"");
            }
            for (int i = 0; i <word2.length() ; i++) {
                temp1=temp1.replace((""+word2.charAt(i)),"");
            }
            return temp1==temp2;
        }
        return false;
    }



}




