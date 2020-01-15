package day11;

public class WarmUp1_LightOnOff_If {

    public static void main(String[] args) {

        String targetOption;
        targetOption = "aa";

        if (targetOption == "Bd") {
            System.out.println("You have turned on bedroom light");
        } else if (targetOption == "Lr") {
            System.out.println("You have turned on livingroom light");
        }else if (targetOption == "Ki") {
            System.out.println("You have turned on kitch light");
        }else if (targetOption == "Ha") {
            System.out.println("You have turned on bedroom light");
        }else{
            System.out.println("There is no such that light");
        }

    }
}
