package day09;

public class LanguagePicker_With_SwitchStatement {

    public static void main(String[] args) {

        int languageSelection = 5;
        String greeting;

        switch (languageSelection){
            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting = "Salam";
                break;
            case 3:
                greeting = "Hola";
                break;
            case 4:
                greeting = "Privet";
                break;
            case 5:
                greeting = "Merhaba";
                break;
            case 6:
                greeting = "Szia";
                break;
            case 7:
                greeting = "Bonjour";
                break;

            default:
                greeting = "Unknown";

        }
        System.out.println(greeting+", SDET.");
    }
}
