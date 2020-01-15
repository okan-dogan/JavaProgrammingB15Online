package repl_it;
/*
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"
 */


public class Repl_It_184_MethodsWithString_At3rdChar {

    public static void main(String[] args) {

    }

    public static String at3(String target,String word){

        String result=target.substring(0,3)+word+target.substring(3);
        return result;
    }

}




