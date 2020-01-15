package office_hour;

public class Practice_11_27 {

    public static void main(String[] args) {

        String message = " I LOVE    JAVA      ";

        System.out.println("message =<"+message+">");

        String messageTrimmed = message.trim();

        System.out.println("messageTrimmed =<"+messageTrimmed+">");

        // isEmpty -->> Check Whether a string object is empty, meaning there is nothing inside
        // isEmpty = yourString.length() == 0 -->>true

        String emptySpaces = "          ";
        System.out.println("emptySpaces = <"+emptySpaces+">");

        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is = "+emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is empty??? = "+emptySpacesAfterTrimmed.isEmpty());


        System.out.println("emptySpaces is blank or not??"+emptySpaces.isBlank());



    }
}
