package office_hour.office_hour_01302020;

public abstract class Car {
    // public abstract return-type  methodName();
    public abstract void start();
}
class Toyota extends Car {
    @Override
    public void start(){
        System.out.println("Push Button");
        System.out.println("Start Engine");
    }
}
class Jeep extends Car{
    public void start(){
        System.out.println("Call Machanic");
        System.out.println("Oil change");
        System.out.println("Start engine");
    }
}
abstract class ElectricCars extends Car{
    public abstract void HasBattery();
    // there 2 abstract methods: start(), HasBattery()
}
class Tesla extends ElectricCars {
    @Override
    public void start(){
        System.out.println("say start");
        System.out.println("star engine");
    }
    @Override
    public void HasBattery(){
        System.out.println("Tesla has Battery");
    }
}
class Test{
    public static void main(String[] args) {
        Jeep obj1 = new Jeep();
        obj1.start();
        System.out.println("========================================");
        Toyota obj2= new Toyota();
        obj2.start();
        System.out.println("========================================");
        Tesla obj3 = new Tesla();
        obj3.start();
        System.out.println("========================================");
        //  Car obj4 = new Car(); // abstract calss is not concrete we cannot create object
    }
}
