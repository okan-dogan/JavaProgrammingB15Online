package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {

        String citizenType;
        int citizenAge = 55;

        if (citizenAge>65){
            citizenType = "Senior";
        }else {
            citizenType = "not Senior";
        }

        System.out.println("The citizen age is "+citizenAge+", and he is a "+citizenType);



    }
}
