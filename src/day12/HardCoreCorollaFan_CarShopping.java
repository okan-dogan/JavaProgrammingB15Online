package day12;

public class HardCoreCorollaFan_CarShopping {

    public static void main(String[] args) {

        String carBrand = "Corolla";
        int carPrice = 60000;
        double budget = 40000;

        if(carBrand.equals("Corolla")||(carBrand.equals("Tesla")&&carPrice<=40000)){
            System.out.println("CAR ACQUIRED");
        }else {
            System.out.println("NOT WHAT I AM LOOKING FOR");
        }


    }
}
