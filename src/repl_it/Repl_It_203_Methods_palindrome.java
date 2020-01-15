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
import java.util.Arrays;

public class Repl_It_203_Methods_palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Nurses Run"));
    }

    public static boolean isPalindrome(String check) {
        check=check.replace(" ","").toUpperCase();
        String palind = "";

        for (int i = check.length()-1; i >=0 ; i--) {
            palind+=check.substring(i,i+1);
        }

        return check.equals(palind);

    }


}




