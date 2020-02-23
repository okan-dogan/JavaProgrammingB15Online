package day47;
// this is called concrete class
// concrete class must provide body for all inherited abstract methods
// or it will not even compile
public class GasCar extends Car{

    int gasLevel;

    // implementing an abstract method in sub class means
    // providing body for teh method in sub class
    @Override
    public void start() {
        System.out.println("This is how Gas Car starts");

    }

    @Override
    public void goForward() {
        System.out.println("GOING FORWARD GS");

    }

    @Override
    public void goBackward() {
        System.out.println("GOING BACKWARD GS");

    }

    @Override
    public void turn(String direction) {
        System.out.println("TURNING GC "+direction);

    }




}
