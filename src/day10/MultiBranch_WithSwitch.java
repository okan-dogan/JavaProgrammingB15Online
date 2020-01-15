package day10;

public class MultiBranch_WithSwitch {

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
        //what data type of variable I can use here
        //byte, short, int, char, String
        switch (menuNumber){
            case 11:
                System.out.println("Your have selected 11");
                order = "Burger";
                break;
            case 5:
                System.out.println("Your have selected 5");
                order = "French Fries";
                break;
            case 8:
                System.out.println("Your have selected 8");
                order = "Nuggets";
                break;
            case 35:
                System.out.println("Your have selected 35");
                order = "Ice Cream";
                break;
            default:
                System.out.println("Your have selected unknown item");
                order = "Unknown";
        }
        System.out.println("Your order is "+order);
    }
}