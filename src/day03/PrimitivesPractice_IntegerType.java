package day03;

public class PrimitivesPractice_IntegerType {


    public static void main(String[] args) {

       // byte (1 byte), short (2 byte), int (4 byte), long (8 byte), float (4 byte), double (8 byte), char (2 byte), boolean (1 bit)


        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount );

        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount );

        int zipCode = 33040;
        System.out.println("The zip code count is " + zipCode );

        long milesToMoon = 500000l;
        long milesToSun = 100000000L;

        System.out.println("The miles to the moon are " + milesToMoon );
        System.out.println("The miles to the sun are " + milesToSun );


        //-------------floating point-------------
        // you must add f,F (case doesn't matter) at the end of number to indicate this is float data type

        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;

        System.out.println("The price of banana is " + priceOfBanana );
        System.out.println("The price of potato is " + priceOfPotato );


        //-----------large floating point numbers--------
        // compiler automatically assume it is double so it is not mandatory but as good programming habit, always add it
        double priceOfIpad1 = 355.99d;
        double priceOfIpadPro = 1024.99D;
        double priceOfMac = 2299.99;

        System.out.println("The price of Ipad 1 is " + priceOfIpad1 );
        System.out.println("The price of Ipad Pro is " + priceOfIpadPro );
        System.out.println("The price of Mac is " + priceOfMac );


        // If you have a whole number by itself, compiler automatically assume it is an int




        System.out.println("test");




    }
}
