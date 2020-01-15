package day16;

public class FirstAndLastWordGetter {

    public static void main(String[] args) {

        //                 0123456789012345678
        String sentence = "You understand JAVA";
        int firstSpaceIndex = sentence.indexOf(" ");
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        
        String firstWord = sentence.substring(0,firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);
        
        String lastWord = sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord = " + lastWord);
        
        
    }
}
