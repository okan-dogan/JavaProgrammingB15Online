package day06;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        int myFavNum = 300;
        int yourFavNum = myFavNum;

        System.out.println("My favorite number is "+myFavNum+" and your favorite number is "+yourFavNum+" too.");

        myFavNum = 500;
        yourFavNum = myFavNum;
        System.out.println("My favorite number is "+myFavNum+" and your favorite number is "+yourFavNum+" too.");

        yourFavNum = 100;
        System.out.println("My favorite number is "+myFavNum+" and your favorite number is "+yourFavNum+" too.");

    }
}
