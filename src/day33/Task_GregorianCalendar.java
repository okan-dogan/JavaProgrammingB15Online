package day33;
/*
Akbar A 00:10
In the Gregorian calendar three criteria must be taken into account to identify leap years:
The year can be evenly divided by 4;
If the year can be evenly divided by 100, it is NOT a leap year, unless;
The year is also evenly divisible by 400.  Then it is a leap year.
Write a method
public static boolean isLeapYear(int year){
//TODO Your codes here
        return false; //return correct result
}
 */
public class Task_GregorianCalendar {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2019));


    }



    public static boolean isLeapYear(int year){
//TODO Your codes here
        boolean calendar=false;
        if(year%400==0){
            calendar=true;
        }else if(year%100==0){
            calendar=false;
        }else if(year%4==0){
            calendar=true;
        }
        return calendar; //return correct result
    }

}
