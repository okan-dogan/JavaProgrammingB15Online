package office_hour;

public class Practice_12_10 {

    public static void main(String[] args) {

        String [] cars={ "bmw" , "vw" , "audi" };
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println();
        // carModel is temporary String holding the each value for each loop;
        for ( String carModel : cars ) {
            System.out.println("I wanna buy "+carModel);
        }

    }
}
