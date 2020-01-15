package day31;

public class Greeting {

    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Batch 15");
        sayHelloTo("kids");
    }

    public static void sayHelloTo(String toHello){
        System.out.println("Hello "+toHello);
    }

    public static void sayHello(){
        System.out.println("Hello B15");
    }


}
