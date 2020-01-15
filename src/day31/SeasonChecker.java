package day31;

public class SeasonChecker {

    public static void main(String[] args) {
        // a String variable declared and assigned value inside main method
        // it can be accessible in main method
        decideSeasonAction("Winter");
        decideSeasonAction("Summer");
        String mySeason = "AAAA";
        decideSeasonAction(mySeason);

        System.out.println("AAAA");
        System.out.println(mySeason);



    }

    public static void decideSeasonAction(String season1){
        // this season parameter can only be accessible inside method body
        switch (season1){
            case "Spring":
                System.out.println("Hiking");
                break;
            case"Summer":
                System.out.println("Swimming");
                break;
            case"Fall":
                System.out.println("Pumpkin picking");
                break;
            case"Winter":
                System.out.println("Go snowboarding");
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}



