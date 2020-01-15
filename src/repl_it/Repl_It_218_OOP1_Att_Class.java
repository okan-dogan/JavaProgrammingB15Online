package repl_it;
/*
The class Atts holds a few attributes and has a method called asString.

the attributes are name and color -both are strings and amount which is an int.
their visibility is public.

asString returns a string showing all the Atts in a format.

for example:

   Atts a = new Atts();
   a.name = "table";
   a.color = "brown";
   a.amount = 1;

   System.out.println(a.asString());

prints:
name: table color: brown amount: 1

create the required attributes and method inside the atts class

 */


public class Repl_It_218_OOP1_Att_Class {

    String name, color;
    int amount;

    public String asString(){
        String result="name: "+name+" color: "+color+" amount: "+amount;
        return result;
    }

}