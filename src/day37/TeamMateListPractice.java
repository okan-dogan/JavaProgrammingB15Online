package day37;

import java.util.ArrayList;

/*
Warm up:
Create Arraylist of String and store
teamMates
print one by one
print reverse
print first last
print 2 at a time
concat everyone in one string separated by -
 */
public class TeamMateListPractice {

    public static void main(String[] args) {

        ArrayList<String> teamMates = new ArrayList<>();

        teamMates.add("Okan");
        teamMates.add("Derya");
        teamMates.add("Yusuf Halit");
        teamMates.add("Inci");
        teamMates.add("Ibrahim");
        teamMates.add("Ayten");
        teamMates.add("Sevgi");


        System.out.println("Team Mates = "+teamMates);

        // first item
        System.out.println("\nFirst Item = "+teamMates.get(0));

        //second Item
        System.out.println("Last Item = "+teamMates.get(teamMates.size()-1));

        System.out.println("\nALL ITEMS");
        for (int i = 0; i <teamMates.size() ; i++) {
            System.out.println("\tItem "+(i+1)+" = "+teamMates.get(i));
        }

        System.out.println("\nALL ITEMS REVERSE ORDER");
        for (int i = teamMates.size()-1; i >=0 ; i--) {
            System.out.println("\tItem "+(i+1)+" = "+teamMates.get(i));
        }

        // print 2 items at a time by repeating
        // i.e. 1-2, 2-3, 3-4, 4-5,
        System.out.println("\nPrint 2 items at a time by repeating: ");
        for (int i = 0; i <=teamMates.size()-2 ; i++) {
            System.out.println("\t"+teamMates.get(i)+"----"+teamMates.get(i+1));
        }

        // print 2 items at a time without repeating
        // i.e. 1-2, 3-4, 5-6, 7-8,
        System.out.println("\nPrint 2 items at a time without repeating: ");
        for (int i = 0; i <=teamMates.size()-2 ; i+=2) {
            System.out.println("\t"+teamMates.get(i)+"----"+teamMates.get(i+1));
        }



    }
}
