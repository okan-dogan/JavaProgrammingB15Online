package day31;

// WHY DO WE NEED TO HAVE A METHOD
// REUSABLE CODE !!! AVOID CODE DUPLICATE

public class MethodIntro {

    // DO NOT CREATE A METHOD INSIDE MAIN METHOD
    // IT CAN BE ANYWHERE INSIDE THE CLASS OUTSIDE MAIN METHOD

    public static void main(String[] args) {
        // two ways to call static methods
        // ClassName.methodName (external data if needed)
        // if you are in same class
        // you can directl call them
        // methodName (external data if needed)
        // MethodIntro.sayHello();  ===>> Optioanl if you are in the same class
        System.out.println("=====Begin=====");
        sayHello();
        System.out.println("=======");
        sayHello();
        System.out.println("=====The End=====");

        // Java goes line 12 and then 13 and then 23,24,25,26 and then returns to 14
        // and 15 and again 23,24,25,26 and returns to 16

    } // main method ends here

    public static void sayHello(){
        System.out.println("Hello World");
        System.out.println("My name is OKAN");
        System.out.println("I love Java");
    }

}
