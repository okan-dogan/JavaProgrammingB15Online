package day35;
/*
String sentence
	= "I bought 3 tomato and the price was 3.14 each"
How much is your final checkout price
The count is always 3rd word
The price is always at 2nd word from the last
 */
public class FloatPractice {

    public static void main(String[] args) {
        
        String sentence = "I bought 3 tomato and the price was 3.14 each";
        Float priceF = Float.valueOf(sentence.split(" ")[sentence.split(" ").length-2]);
        int countI = Integer.valueOf(sentence.split(" ")[2]);
        System.out.println("priceF = " + priceF);
        System.out.println("countI = " + countI);

    }
}
