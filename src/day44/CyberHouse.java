package day44;

public class CyberHouse {

    // we can change default value of the fields
    // by assigning value directly in the template class
    String design;
    int houseNum;
    private static String neighborhoodName="Lake Garden";



    // constructor can access everything
    public CyberHouse(String design, int houseNum){
        this.design=design;
        this.houseNum=houseNum;

    }



    // static method can only access static members of same class
    public static void showNeighborhood(){
        System.out.println("neighborhoodName = " + neighborhoodName);

        // cannot access anything non-static inside static methods
        //System.out.println("houseNum = " + houseNum);


    }


    // instance method can access anything
    public void showAllInfo() {
        System.out.println("CyberHouse{" +
                "design='" + design + '\'' +
                ", houseNum=" + houseNum +
                ", neighborhoodName='" + neighborhoodName + '\'' +
                '}');
    }
}
