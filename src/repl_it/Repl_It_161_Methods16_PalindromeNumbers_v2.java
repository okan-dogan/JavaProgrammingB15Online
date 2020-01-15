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
public class Repl_It_161_Methods16_PalindromeNumbers_v2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);



    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String numS = String.valueOf(num);
        String[] numSArr = numS.split("");

        String reverseNumS="";
        for (int i = numSArr.length-1; i >=0 ; i--) {
            reverseNumS += numSArr[i];
        }
        int reverseNums= Integer.valueOf(reverseNumS);

        System.out.println(num==reverseNums);


    }


}

