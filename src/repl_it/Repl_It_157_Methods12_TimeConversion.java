package repl_it;

import java.util.*;

public class Repl_It_157_Methods12_TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */


        if(s.contains("AM")){
            s=s.replace("AM","");
            String[] timeParts = s.split(":");
            int hour = Integer.valueOf(timeParts[0]);
            if(hour==12){
                hour=0;
                timeParts[0] = 0+String.valueOf(hour);
                System.out.println(timeParts[0]+":"+timeParts[1]+":"+timeParts[2]);
            }else if (hour==11){
                System.out.println(timeParts[0]+":"+timeParts[1]+":"+timeParts[2]);
            }else{
                timeParts[0] = 0+String.valueOf(hour);
                System.out.println(timeParts[0]+":"+timeParts[1]+":"+timeParts[2]);
            }


        }else if(s.contains("PM")){
            s=s.replace("PM","");
            String[] timeParts = s.split(":");
            int hour = Integer.valueOf(timeParts[0]);
            if(hour==12){
                System.out.println(timeParts[0]+":"+timeParts[1]+":"+timeParts[2]);
            }else{
                hour+=12;
                timeParts[0] = String.valueOf(hour);
                System.out.println(timeParts[0]+":"+timeParts[1]+":"+timeParts[2]);
            }
        }



    }
}