package day12;


public class Login_CheckingStringEqualityWithoutCase {

    public static void main(String[] args) {


        String userName = "abc123";
        boolean userNameCorrect = userName.equals("ABC123");
        System.out.println(userNameCorrect);

        boolean userNameCorrect2 = userName.equalsIgnoreCase("ABC123");
        System.out.println(userNameCorrect2);


    }
}
