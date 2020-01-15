package day38;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {

    public static void main(String[] args) {

        List<String> groceries = Arrays.asList("Egg", "Milk", "Butter", "Apple", "Salmon");
        System.out.println("groceries = " + groceries);

        ArrayList<String> newLst = new ArrayList<>(groceries);
        newLst.add("Coke");
        newLst.add("Sugar");

        System.out.println("newLst = " + newLst);
        // actually I have list of items for you here ; Pasta, branzini, asparagus, spinach
        // good news is I already created a List object for you so you can just add them all to your existing list
        List<String> newItemsToAdd = Arrays.asList("Pasta", "Branzini", "Asparagus", "Spinach");

        // Adding one list to another list
        // we want to add all items inside newItemsToAdd to newLst
        newLst.addAll(newItemsToAdd);
        System.out.println("newLst with all items after addAll= " + newLst);




    }


}
