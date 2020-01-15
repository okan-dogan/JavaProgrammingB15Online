package day09;

public class LanguagePicker {

    public static void main(String[] args) {

        String calledGreeting="";
        int languageOption;

        languageOption=5;

        if (languageOption==1){
            calledGreeting="Hello";
        }else if (languageOption==2){
            calledGreeting="Salam";
        }else if(languageOption==3){
            calledGreeting="Hola";
        }else if(languageOption==4){
            calledGreeting="Privet";
        }else if(languageOption==5){
            calledGreeting="Merhaba";
        }else if(languageOption==6){
            calledGreeting="Szia";
        }else if(languageOption==7){
            calledGreeting="Bonjour";
        }else{
            calledGreeting="Unknown language";
        }

        System.out.println("\""+calledGreeting+", SDET\"");



    }
}
