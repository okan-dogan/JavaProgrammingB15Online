package day37;

import java.util.ArrayList;
import java.util.List;

public class FindingTheLongestName {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Okan");
        nameList.add("Derya");
        nameList.add("Yusuf Halit");
        nameList.add("Inci");
        nameList.add("Ibrahim");
        nameList.add("Ayten");
        nameList.add("Sevgi");

        System.out.println("nameList = " + nameList);

        String longestName = nameList.get(0);
        for (int i = 0; i <nameList.size() ; i++) {
            if(nameList.get(i).length()>longestName.length()){
                longestName=nameList.get(i);
            }
        }
        System.out.println("The longest name in the ArrayList is = " + longestName);

        // what if you had more than one longest name
        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnur");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");

        System.out.println("\nnameLst = " + nameLst);
        // > will give you first longest name if you have more than one
        // >= will give you last longest name if you have more than one
        String longestName2 = nameList.get(0);
        for (int i = 0; i <nameList.size() ; i++) {
            if(nameLst.get(i).length()>longestName2.length()){
                longestName2=nameLst.get(i);
            }
        }
        System.out.println("The longest name in the ArrayList is = " + longestName);

        for (int i = 0; i <nameLst.size() ; i++) {
            if(nameLst.get(i).length()==longestName2.length()){
                System.out.println("longest names = " + nameLst.get(i));
            }
        }


    }
}
