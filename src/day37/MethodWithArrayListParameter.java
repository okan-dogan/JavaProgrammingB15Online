package day37;

import java.util.ArrayList;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");

        printAList(nameLst);
        
        String resultLongestName=getLongestName(nameLst);
        System.out.println("resultLongestName = " + resultLongestName);
        


    }

    // create a method that accept a List of String as argument
    // same thing as a method that has List of String parameter
    // and print out each and every item in the List vertically
    // return nothing
    /*
    this method will print out the content of passed List object vertically
    @param lst of String
    @return nothing
     */
    public static void printAList (ArrayList<String> lst){
        for (String each : lst) {
            System.out.println("each = "+each);
        }
    }
    
    public static String getLongestName (ArrayList<String> lst){
       String longestName=lst.get(0);
        for (String eachName : lst) {
            if(eachName.length()>longestName.length()){
               // if you use >= you get the last longest name in the list
               longestName=eachName;
            }
        }
        return longestName;
    }
}
