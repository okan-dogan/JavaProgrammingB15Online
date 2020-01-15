package repl_it;

import java.util.Scanner;

/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */
public class Repl_It_157_Methods12_TimeConversion_v2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        if(s.contains("AM")){
            int fTwoNum = Integer.parseInt(s.substring(0,2));
            if(fTwoNum==12){
                s="00"+s.substring(2);
                System.out.println(s.substring(0,8));
            }else{
                System.out.println(s.substring(0,8));
            }
        }else if(s.contains("PM")){
            int fTwoNum = Integer.parseInt(s.substring(0,2));
            if(fTwoNum<12){
                fTwoNum += 12;
                String newFormat = String.valueOf(fTwoNum);
                s=newFormat+s.substring(2);
                System.out.println(s.substring(0,8));
            }else{
                System.out.println(s.substring(0,8));
            }
        }


    }
}
