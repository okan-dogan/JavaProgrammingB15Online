package day24;

import java.util.Arrays;

public class Task1_LongestStrStringArray {

    public static void main(String[] args) {

        // Find the longest word in a string array

        String [] familyMembers = {"Okan", "Derya","Yusuf Halit","Inci" };
        System.out.println("My family has "+familyMembers.length+" members.");
        System.out.println("Names of each member are "+ Arrays.toString(familyMembers));
        String longestName = familyMembers[0];
        String shortestName = familyMembers[0];
        for (String eachMember : familyMembers) {
            if (eachMember.length()>longestName.length()){
                longestName=eachMember;
            }
            if (eachMember.length()<shortestName.length()){
                shortestName=eachMember;
            }
        }
        System.out.println("The longest name in my family is "+longestName);
        System.out.println("The shortest name in my family is "+shortestName);

    }
}
