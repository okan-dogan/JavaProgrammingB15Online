package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {

    public static void main(String[] args) {
        
        String sentence = "We are trying to find the longest word in this sentence!!!";
        
        String[] allWordsOfSentence = sentence.split(" ");
        System.out.println("allWordsOfSentence = " + Arrays.toString(allWordsOfSentence));
        String longestWord="";
        int maxCharCount=0;

        for (String currentWord : allWordsOfSentence) {
            //System.out.println("currentWord = " + currentWord);
            if(currentWord.length()>longestWord.length()){
                longestWord=currentWord;
            }

        }
        System.out.println("My longest word in this sentence is = " + longestWord);
        
    }
}
