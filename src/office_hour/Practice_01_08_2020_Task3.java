package office_hour;

import java.util.*;

/*
Create a method that accept String object and
return List<Character> that contains each character.
 */
public class Practice_01_08_2020_Task3 {

    public static void main(String[] args) {

        System.out.println(nameChrToList("OKAN"));

        List<Character> resultList = nameChrToList("Muge");
        resultList.add('9');
        System.out.println("\nresultList = " + resultList);

    }

    public static List<Character> nameChrToList (String name){

        List<Character> chrLst = new ArrayList<>();

        for (int i = 0; i <name.length() ; i++) {
            chrLst.add(name.charAt(i));
        }

        return chrLst;
    }


}
