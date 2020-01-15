package day22;

public class UniqueCharacters {

    public static void main(String[] args) {
                     //0123456789
        String name = "okan dogan";
        int nameIndex = name.length()-1;
        String uniqueChars ="";

        for (int i = 0; i <=nameIndex ; i++) {
            if(uniqueChars.contains(name.substring(i,i+1))){
                continue;
            }
            uniqueChars+=name.substring(i,i+1);
            System.out.print(name.substring(i,i+1));

        }
    }
}
