package day09;

public class DayPrinter_With_SwitchStatement2 {

    public static void main(String[] args) {

        int dayCode =7;
        String dayName;

        switch (dayCode){

            case 1:
                dayName = "Monday";
                break; //used to get out of this branch (in if statement it goes automatically to the next line)
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Unknown";
        }

        System.out.println("Day name is "+dayName);


    }
}
