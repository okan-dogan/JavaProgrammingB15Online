package repl_it;
/*
coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly
looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Examples:
coverString("java methods", "me") ) ; ==> "java [me]thods"

coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

coverString("apples", "pears") ) ; ==> "[apples]"
 */


public class Repl_It_180_MethodsWithString_Cover_v2_Only4th_Test_Fail {

    public static void main(String[] args) {
        System.out.println(coverString("hi", "hi") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {

        if(main.contains(coverME)){
            String result = "";
            for (int i = 0; i <main.length() ; i++) {
                if(i==main.indexOf(coverME,i)){
                    result+="["+coverME+"]";
                    i+=coverME.length()-1;
                }else{
                    result+=main.substring(i,i+1);
                }

            }
            return result;
        }else{
            main="["+main+"]";
            return main;
        }
    }

}




