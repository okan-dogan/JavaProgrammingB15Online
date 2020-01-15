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
public class Repl_It_161_Methods16_PalindromeNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);



    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String numS = String.valueOf(num);
        String[] numSArr = new String[numS.length()];
        for (int i = 0; i <numS.length() ; i++) {
            numSArr[i]=numS.substring(numS.length()-1-i,numS.length()-i);
        }

        String reverseNumS="";
        for (int i = 0; i <numSArr.length ; i++) {
            reverseNumS += numSArr[i];
        }
        int reverseNums= Integer.valueOf(reverseNumS);

        System.out.println(num==reverseNums);


    }


}

