package day39;
// Create car object using Class
// or
// Get an instance of Car class
public class CarCreation {


    public static void main(String[] args) {
        Car m1 = new Car();
        m1.producer = "Toyota";
        m1.modelName = "Corolla";
        m1.color = "Blue";
        m1.modelYear = 2019;

        m1.changeColorTo("Red");

        m1.goForward();

        System.out.println(m1.producer+" | "+m1.modelName+" | "+m1.color+" | "+m1.modelYear);

        m1.printCarAge();
        System.out.println("======");

        Car m2 = new Car();
        m2.producer = "Hyundai";
        m2.modelName = "Sonata";
        m2.color = "White";
        m2.modelYear = 2016;

        m2.goForward();

        System.out.println(m2.producer+" | "+m2.modelName+" | "+m2.color+" | "+m2.modelYear);
        m2.printCarAge();

    }


}
