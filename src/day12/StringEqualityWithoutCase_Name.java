package day12;


public class StringEqualityWithoutCase_Name {

    public static void main(String[] args) {


        String userName = "Okan";
        boolean userNameCorrect = userName.equals("OKAN");
        System.out.println(userNameCorrect);

        boolean userNameCorrect2 = userName.equalsIgnoreCase("OKAN");
        System.out.println(userNameCorrect2);


    }
}
