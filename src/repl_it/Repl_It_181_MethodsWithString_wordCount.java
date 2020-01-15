package repl_it;
/*
This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1
 */


public class Repl_It_181_MethodsWithString_wordCount {

    public static void main(String[] args) {
        System.out.println(wordCount("Okan Derya YusufHalit Inci") ) ;
    }

    public static int wordCount(String words) {
        String[] wordsStr = words.split(" ");
        return wordsStr.length;

    }

}




