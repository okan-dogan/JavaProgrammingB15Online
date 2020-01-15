package day10;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        System.out.println("Welcome to McDonalds, what can I get for you?");

        /*
        * 11 burger
        * 5 french fry
        * 8 nuggets
        * 35 ice cream
         */

        int menuNumber = 10;
        String order = "";

        if (menuNumber==11){

            System.out.println("Your have selected 11");
            order = "Burger";
        }else if (menuNumber==5){
            System.out.println("Your have selected 5");
            order = "French Fries";
        }else if (menuNumber==8) {
            System.out.println("Your have selected 8");
            order = "Nuggets";
        }else if (menuNumber==35) {
            System.out.println("Your have selected 35");
            order = "Ice Cream";
        }else{
            System.out.println("Your have selected unknown item");
            order = "Unknown";
        }

        System.out.println("Your order is "+order);
    }
}
