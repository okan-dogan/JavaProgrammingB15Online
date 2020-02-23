package day47;
// I don't need to create Car object using this class
// I only want this Class to be a super class
// to provide reusable fields and methods for sub-classes
// this Class is designed to be a super class


public abstract class Car {

    int year;
    String brand;

    /*
    ONLY abstract class can have abstract method
    it has abstract keyword
    and it doesn't have any body, DOES NOT HAVE {}
    it ends with ';'
    it's meant to be overridden to provide body in sub class
     */

    public abstract void start();

    // add abstract methods:
    // goForward , goBackward
    // turn (String direction)
    // and implements these methods in ElectricCar

    public abstract void goForward();
    public abstract void goBackward();
    public abstract void turn(String direction);

    public void doCarthing(){
        System.out.println("Non-Abstract Method can be in an Abstract Class");
    }

    public static void doStaticThing(){
        System.out.println("Static Method can be in an Abstract Class");

    }





}
