package day33;

/*
 * getSumFrom1toX
 * This method should calculate the sum of
 * the numbers from 1 to the number user passed
 * @param x final number to be added
 * @return the sum of numbers from 1 to x as int

 * build_GOT_Email
 * This method should build email using user's first and last name
 * for example Jon Snow --->> JSnow@NightWatch.com
 * @param firstName user's first name
 * @param lastName  user's last name
 * @return the email created using
 * firstName initial+lastname+@NightWatch.com
 */
public class Tasks_GetSumFrom1toX_BuiltGotEmail {

    public static void main(String[] args) {
        System.out.println(getSumFrom1ToX(10));
        // 1+2+3+4+5+6+7+8+9+10=55
        System.out.println(build_GOT_Email("OKAN","DOGAN"));
        // odogan@nightwatch.com


    }

    public static int getSumFrom1ToX(int number){
        int sum=0;
        for (int i = 1; i<=number ; i++) {
            sum+=i;
        }
        return sum;
    }

    public static String build_GOT_Email (String name, String lastName){
        String eMail="";
        eMail=name.substring(0,1).toLowerCase()+lastName.toLowerCase()+"@nightwatch.com";
        return eMail;
    }
}
