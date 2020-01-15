package day14;

public class EmailChecker {

    public static void main(String[] args) {

        /*
        if it doesn't contain character @ or
        if it contains space say invalid password

        if it endsWith @gmail.com --->> gmail
        if it endsWith @yahoo.com --->> yahoo
        if it endsWith @mail.ru --->> russian
         */

        String eMail = "okan.dogan@mail.com";

        boolean charMail = eMail.contains("@");
        boolean spaceMail = eMail.contains(" ");
        boolean gMail = eMail.endsWith("@gmail.com");
        boolean yahooMail = eMail.endsWith("@yahoo.com");
        boolean ruMail = eMail.endsWith("@mail.ru");

        if (!charMail||spaceMail){
            System.out.println("INVALID ADDRESS");
        }else{
            if (gMail) {
                System.out.println("GMAIL");
            } else if(yahooMail){
                System.out.println("YAHOO");
            } else if(ruMail){
                System.out.println("RUSSIAN");
            } else {
                System.out.println("Unknown Domain Name");
            }
        }


    }
}
