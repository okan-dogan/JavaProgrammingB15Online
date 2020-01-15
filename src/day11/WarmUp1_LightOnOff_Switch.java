package day11;

public class WarmUp1_LightOnOff_Switch {

    public static void main(String[] args) {

        String targetOption;
        targetOption = "Lr";

        switch (targetOption){
            case "Bd":
                System.out.println("You have turned on bedroom light");
                break;
            case "Lr":
                System.out.println("You have turned on livingroom light");
                break;
            case "Ki":
                System.out.println("You have turned on kitch light");
                break;
            case "Ha":
                System.out.println("You have turned on bedroom light");
                break;
            default:
                System.out.println("There is no such that light");
                break;
        }

    }
}
