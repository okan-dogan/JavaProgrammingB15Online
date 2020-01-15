package repl_it;
/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */


public class Repl_It_185_MethodsWithString_BiggerString {

    public static void main(String[] args) {

    }

    public static String biggerS(String a ,String b){

        if(a.length()>b.length()){
            return a;
        }else{
            return b;
        }

    }

}




