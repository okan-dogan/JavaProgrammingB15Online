package day33;

import java.util.Arrays;

/*
Create a class called ReturnKeywordPractice with main
calculateAndReturnAge
Write a method accept a birth year and return the age :
the birth year should be within the range of 1900-2020
if not return 0

optionally : test your code against array of birthYears
{1999,122,2019, 1987, 1978,1964,3999, 2004}
 */
public class MethodWithReturnPractice3 {

    public static void main(String[] args) {

        System.out.println(calculateAndReturnAge(2013));
        System.out.println(calculateAndReturnAge(2016));
        System.out.println(calculateAndReturnAge(1986));
        System.out.println(calculateAndReturnAge(1881));

        int [] birthYears = {1999,122,2019, 1987, 1978,1964,3999, 2004};
        for (int eachBirth : birthYears) {
            System.out.print(calculateAndReturnAge(eachBirth)+", ");
        }


    }

    public static int calculateAndReturnAge(int yearOfBirth){
        int currentAge=0;

        if(yearOfBirth>=1900&&yearOfBirth<=2020){
            currentAge=2020-yearOfBirth;
        }

        return currentAge;
    }

}
