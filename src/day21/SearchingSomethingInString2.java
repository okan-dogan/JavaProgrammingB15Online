package day21;

public class SearchingSomethingInString2 {

    public static void main(String[] args) {

        String name = "Okan Dogan";

        int nameLength = name.length();
        int nameIndex = nameLength-1;
        int counter = 0;

        for (int i = 0; i <=nameIndex-1 ; i++) {
            String currentChar = name.substring(i,i+2);
            if (currentChar.equalsIgnoreCase("an")){
                counter++;
                System.out.println("It is in index " +i);
            }
        }
        System.out.println("Your name has total "+ counter + " group of letters "+"\"an\"");

    }
}
