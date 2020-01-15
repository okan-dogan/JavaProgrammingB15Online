package day35;
/*
Given any String  for example
String str = "A34B123C4X";
Add all the numbers inside the String : above String should generate 17
 */
public class CharacterPractice2 {
    
    public static void main(String[] args) {

        String str = "A34B123C4X";
        char[] allChars=str.toCharArray();
        int totalNums=0;

        for (char eachAllChar : allChars) {
            if(Character.isDigit(eachAllChar)){
                totalNums+=Integer.parseInt(eachAllChar+"");
                System.out.println(Integer.parseInt(eachAllChar+""));
            }
        }
        System.out.println("totalNums = " + totalNums);

        totalNums=0;

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                totalNums+=Integer.valueOf(str.charAt(i)+"");
                System.out.println(Integer.valueOf(str.charAt(i)+""));
            }
        }
        System.out.println("totalNums = " + totalNums);
        
        
    }
}
