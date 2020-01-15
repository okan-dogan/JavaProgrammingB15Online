package day16;

public class WarmUpTask1 {
    public static void main(String[] args) {

        String word1 = "Okan";
        String word2 = "";
        word2 = word2+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);

        // if you assign word1 as ""
        // you can make;
        // String word2 = word2 + word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        // you get a string as you use String "" at the beginning
        // but if you use String word2 += word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0);
        // you get an int as Java starts to concatenate the ints first and then adds String "" at the end

//        System.out.println(word2 + word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0));
//        System.out.println(word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0)+word2);

        System.out.println(word1);
        System.out.println(word2);



    }
}
