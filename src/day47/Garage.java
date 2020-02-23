package day47;

public class Garage {

    public static void main(String[] args) {

        // Abstract class can not be instantiated
        // It means we can not create object out of it
//        Car c1 = new Car();


        ElectricCar eC1 = new ElectricCar();
        eC1.start();
        eC1.goForward();
        eC1.goBackward();
        eC1.turn("Right");
        eC1.turn("Left");

        // Create another sub class of Car called GasCar
        // add a field called gasLevel
        // implement all the abstract method of Car

        GasCar gC1 = new GasCar();
        gC1.start();
        gC1.goForward();
        gC1.goBackward();
        gC1.turn("Right");
        gC1.turn("Left");


    }


}
