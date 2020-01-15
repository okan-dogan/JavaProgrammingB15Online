package day33;
/*
 * convertNumberToDay
 * This method will take number from 1-7
 * and convert that to actual day in word
 * @param int dayCode to represent day in number
 * @return the day in word in English as String
 *         if the number is valid
 *         if the number is not 1-7 return INVALID DAY!
 */
public class MethodWithReturnPractice2 {

    public static void main(String[] args) {
        System.out.println(convertNumberToDay(7));
        System.out.println(convertNumberToDay(10));
        System.out.println(convertNumberToDay_v2 (7));
        System.out.println(convertNumberToDay_v2(10));


    }
    public static String convertNumberToDay (int dayCode){
        String dayName="";
        switch (dayCode){
            case 1:
                dayName="Monday";
                break;
            case 2:
                dayName="Tuesday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                dayName="Invalid Input";
                break;
        }
        return dayName;
    }

    public static String convertNumberToDay_v2 (int dayCode2) {
        String [] dayNames = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Invalid Input"};
        String dayName2="";
        if(dayCode2>=1&&dayCode2<=7){
            dayName2=dayNames[dayCode2-1];
        }else{
            dayName2=dayNames[7];
        }
        return dayName2;
    }

}
