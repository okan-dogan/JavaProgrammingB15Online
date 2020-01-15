package day10;

public class SeasonAction {

    public static void main(String[] args) {

        /*
        *what fo you do in each season
        *
        * spring hike easter nawruz blossom
        * summer swim vacation BBQ holiday
        * fall black fridey hiking harvest halloween shopping
        * winter snowboarding ski christmas new year
         */

        String season = "Fall";

        switch (season){
            case "Spring":
                System.out.println("Activities: hike, easter, nawruz, blossom");
                break;
            case "Summer":
                System.out.println("Activities: swim, vacation, BBQ, holiday");
                break;
            case "Fall":
                System.out.println("Activities: black fridey, hiking, harvest, halloween, shopping");
                break;
            case "Winter":
                System.out.println("Activities: snowboarding, ski, christmas, new year");
                break;
            default:
                System.out.println("Are you living on MARS!!!");
                break;
        }

    }
}
