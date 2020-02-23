package day42;

public class BikeAction {

    public static void main(String[] args) {

        Bike b1 = new Bike();
        Bike b2 = new Bike();

        // I don't want empty gear when object is created
        // I want the bike to come with gear set to 1

        System.out.println("b1 gear is = " + b1.gear);
        System.out.println("b2 gear is = " + b2.gear);

        // I want to be able to set the default value to gear
        // when object is being created
        // it looks like overloading as they have the same name
        Bike b3 = new Bike(4);
        System.out.println("b3.gear = " + b3.gear);
        System.out.println("b3.speed = " + b3.speed);

        // I want a Bike object with both
        // speed and gear set to the value I specify
        Bike b4 = new Bike(3,55);
        System.out.println("b4.gear = " + b4.gear);
        System.out.println("b4.speed = " + b4.speed);




    }


}
