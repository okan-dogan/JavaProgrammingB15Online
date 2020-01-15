package repl_it;

import java.util.Scanner;

/*
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char
 */
public class Repl_It_153_Methods8_SplitPersonInfo {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;

    }




    public static void person(String info) {
        //your code here
        String[] afterSplit = info.split(",");
        System.out.println("person name: "+afterSplit[0]+" last name: "+afterSplit[1]+" age: "+afterSplit[2]);


    }//end person

}
