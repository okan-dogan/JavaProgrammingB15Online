package repl_it;
/*
This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a cretin number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)

 */


public class Repl_It_183_MethodsWithString_LimitString {

    public static void main(String[] args) {

    }

    public static String limit(String text, int maxLength){
        String result="";
        for(int i=0; i<maxLength;i++){
            result+=text.substring(i,i+1);
        }
        return result;
    }

}




