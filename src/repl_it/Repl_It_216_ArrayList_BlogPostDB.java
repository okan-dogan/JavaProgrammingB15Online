package repl_it;
/*
This task is optional, since we did not practice ArrayLists in this way.

blogDb gets an ArrayList of String Arrays(ArrayList<String[]>) from a database, each row from the database table is represented by a position in the ArrayList. each ArrayList position holds a string array that holds the row data.
the database table columns are : id(string),title(string), content(string).

ArrayList<String[]> r example:
Each item in ArrayList is a String Array

r = [
["1","title","content1"],
["2","another title","content2"],
["3","yet another title","content3"]
]

the String id argument of blogDb method is referring to a row from the table the arraylist holds.
You need to loop through each element in the ArrayList and find the matching String[] with that id.
Then return the title and content in the format below.

for example

blogDb(r,"1")
returns:
title
content1

blogDb(r,"2")
returns:
another title
content2

when you return the string make sure there is a line break between the title and content.
you can use " \n " to line break in a string

 */


import java.util.ArrayList;
import java.util.Arrays;

public class Repl_It_216_ArrayList_BlogPostDB {

    public static void main(String[] args){

        ArrayList<String[]>  arr = new ArrayList<String[]>();
        arr.add(new String[]{"1","title 1","content"});
        arr.add(new String[]{"2","title 2","content"});
        arr.add(new String[]{"3","title 3","content3"});
//        System.out.println(arr.get(0)[0]);   // ===>> 1
//        System.out.println(arr.get(1)[0]);   // ===>> 2
//        System.out.println(arr.get(2)[0]);   // ===>> 3
//        System.out.println(Arrays.toString(arr.get(0)));  // ====>> [1, title 1, content]
//        System.out.println(arr.get(0)[0]);                // ====>> 1
//        System.out.println(arr.get(0)[1]);                // ====>> title 1
//        System.out.println(arr.get(0)[2]);                // ====>> content

        Repl_It_216_ArrayList_BlogPostDB m = new Repl_It_216_ArrayList_BlogPostDB();
        String post = m.blogDb(arr,"3");
        System.out.print(post);
    }

    public String blogDb(ArrayList<String[]> r,String id)  {
    String result="";
        for (int i = 0; i <r.size() ; i++) {
            if(r.get(i)[0].equals(id)){
                result=r.get(i)[1]+"\n"+r.get(i)[2];
            }
        }

    return result;
    }

}