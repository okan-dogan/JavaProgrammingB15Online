package day47;

public class ElectricCar extends Car{

    int batteryLevel;

    @Override
    public void start() {
        System.out.println("This is how Electric Car starts");
    }

    @Override
    public void goForward() {
        System.out.println("GOING FORWARD EC");
    }

    @Override
    public void goBackward() {
        System.out.println("GOING BACKWARD EC");
    }

    @Override
    public void turn(String direction) {
        System.out.println("TURNING EC "+direction);
    }



    public static void main(String[] args) {

        // Car c1 = new Car();


    }


}
