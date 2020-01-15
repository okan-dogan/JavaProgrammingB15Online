package day21;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        String name = "DeryA Dogan";

        int nameLength = name.length();
        int nameIndex = nameLength-1;
        int counter = 0;

        System.out.println("charAt Method");

        for (int i = 0; i <=nameIndex ; i++) {
            if(name.charAt(i)=='a'||name.charAt(i)=='A'){
                counter++;
                System.out.println("It is in index " +i);
            }
        }
        System.out.println("Your name has total "+ counter + " letter a or A");

        System.out.println();
        System.out.println("substring Method");

        counter=0;
        for (int i = 0; i <=nameIndex ; i++) {
            String currentChar = name.substring(i,i+1);
            if (currentChar.equalsIgnoreCase("a")){
                counter++;
                System.out.println("It is in index " +i);
            }
        }
        System.out.println("Your name has total "+ counter + " letter(s) a or A");

    }
}
