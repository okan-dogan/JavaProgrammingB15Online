package day41;

public class TVStore {

    public static void main(String[] args) {

        TV t1 = new TV();
        t1.name="Sony";
        System.out.println("TV1 = "+t1.toString());
        t1.turnOn();
        t1.turnOff();
        t1.turnOff();
        t1.setCurrentChannel(5);
        System.out.println("TV1 = "+t1.toString());

        t1.turnOn();
        t1.setCurrentChannel(5);
        System.out.println("TV1 = "+t1.toString());
        t1.setCurrentChannel(121);
        t1.turnOff();
        System.out.println(t1.toString());


        // System.out.println(t1.getCurrentChannel());


    }
}
