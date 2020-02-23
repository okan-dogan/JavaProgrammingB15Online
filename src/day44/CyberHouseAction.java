package day44;

public class CyberHouseAction {

    public static void main(String[] args) {

        CyberHouse.showNeighborhood();

        CyberHouse ch1 = new CyberHouse("Single",14);
        ch1.showAllInfo();
        CyberHouse ch2 = new CyberHouse("Townhouse",25);
        ch2.showAllInfo();
        //CyberHouse.neighborhoodName="Lake garden";
        // if we convert it from static String neighborhoodName;
        // to private static String neighborhoodName="Lake garden";
        // you get "Lake Garden" for the initial default value of CyberHouse
        // and you cannot change it as long as you don't change the name
        // in your CyberHouse Class
        //
        CyberHouse ch3 = new CyberHouse("Apartment",100);
        CyberHouse ch4 = new CyberHouse("Condo",85);

        ch3.showAllInfo();
        CyberHouse.showNeighborhood();
        ch4.showAllInfo();




        // How do I get max value of Short
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);



    }
}
