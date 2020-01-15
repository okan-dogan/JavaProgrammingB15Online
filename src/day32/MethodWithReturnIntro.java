package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {

        String name = giveMeMyName();
        System.out.println("name = " + name);

        System.out.println(giveMeMyName());
        
        int myResult = doubleTheNum(10);
        System.out.println("myResult = " + myResult);

        System.out.println(doubleTheNum(5));

        System.out.println("The result of doubling 100 is "+ doubleTheNum(100));

        System.out.println(add2Numbers(10,20));
    }

    /*
    I want to create a static method called giveMeMyName
    it returns your name as a result
    it has no parameter
     */

    public static String giveMeMyName(){
        return "Okan";
    }

    /*
    the whole pupose of writing a method that return a value
    so we can save the result after calling the method
    and use it somewhere else
     */

    /*
    Create a static method that double the value of a number
    it accepts one int parameter and return doubled value of that number
     */
    public static int doubleTheNum(int num){
        //System.out.println("I'm going to double the value of "+num);
        num*=2;
        return num;

    }

    public static int add2Numbers (int num1, int num2){

        return num1+num2;
    }

}
