package day42;

public class Bike {

    int speed, gear;

    /*

    Constructor is a block of code that has the same name as ClassName and
    has no return type if it doesn't meet above requirement it will not be a constructor
    the only time you can call this is when object is being created

     */

    public Bike(){
        System.out.println("message from constructor");
        gear = 1;
    }

    public Bike(int gear){
        this.gear = gear;
        // int newGear
        // gear = newGear
    }

    public Bike(int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }

    public Bike(String str){
        System.out.println("ACCEPT STRING @!!!");
    }


}
