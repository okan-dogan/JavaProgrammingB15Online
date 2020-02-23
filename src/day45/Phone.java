package day45;

public class Phone extends Electronic{

    // sub class inherit every visible instance field, static field
    // sub class inherit every visible instance method, static method
//    String brand;
//    static boolean useElectricity = true;
    double size;
    double price;


    // bad idea to have main here
    // but we are doing it anyway for less screen to look at
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.size=12;
        p1.price=399;
        p1.brand="Apple";


        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        // directly accessing the static field of same class in static method
        // main method is a static method
        System.out.println(useElectricity);

        // how to call showBrand method
        p1.showBrand();

        // how to call displayUseElectricity static method
        displayUseElectricity();
        // STATIC WAY
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();



//        public void showBrand(){
//            System.out.println("brand = " + brand);
//        }
//
//        public static void displayUseElectricity(){
//            System.out.println("displaying useElectricity = " + useElectricity);
//        }


    }


}
