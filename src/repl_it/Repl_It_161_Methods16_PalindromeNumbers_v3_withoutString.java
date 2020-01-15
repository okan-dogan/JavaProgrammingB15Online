package repl_it;

import java.util.Scanner;

/*
Complete a method isPalindrome()
that will check if number is a palindrome.
Print your result as a boolean (true or false).
Do not convert int into a string!
Example:
input: 1001
output: true

Example:
input: 1234
output: false

 */
public class Repl_It_161_Methods16_PalindromeNumbers_v3_withoutString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);



    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int lastDig = 0;
        int reversedFull = 0;
        int numCopy = num;

        for (; numCopy > 0;) {
            lastDig=numCopy%10;
            reversedFull=reversedFull*10+lastDig;
            numCopy/=10;
        }
        System.out.println(num==reversedFull);


    }


}

