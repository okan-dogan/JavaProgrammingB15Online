package day20;

public class PalindromeTest {

    public static void main(String[] args) {
        
        // if you reverse a String and if doesn't change
        // it is called as Palindrome
        
        String name = "KAYAK";
        System.out.println("name = " + name);
        String reversedName = "";
        

        for (int i = name.length()-1 ; i >=0 ; i--) {
            reversedName+=name.charAt(i);
        }
        System.out.println("Name's reversed order = " + reversedName);
        
    }
}
