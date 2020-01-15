package day31;

import day03.PrintVsPrintln_ForDay31;

import static day03.PrintVsPrintln_ForDay31.printVsPrintln;

/* task1
Create a method called print 7 line of hello and call it sayHelloWorld7Times

task2
Create a method to take above action , call it calculateMathProblem()


*/
public class MethodPractice {

    // DO NOT CREATE A METHOD INSIDE ANOTHER METHOD

    public static void main(String[] args) {
        // call directly since we are in the same class
        sayHelloWorld7Times();
        // alternatively call using class name
        MethodPractice.sayHelloWorld7Times();
        // you can call static method of other class
        // using ClassName.methodName();
        MethodIntro.sayHello();

        calculateMathProblem();

        printVsPrintln(); // I created a new class under day03 package with the name of "PrintVsPrintln_ForDay31"
                          // under this Class I created a new method name "public static void printVsPrintln() {}"
                          // by importing "import static day03.PrintVsPrintln_ForDay31.printVsPrintln;"
                          // I was able to call and use my method "printVsPrintln();"



    }

    public static void sayHelloWorld7Times(){
        System.out.println("Hello World line 1 ");
        System.out.println("Hello World line 2 ");
        System.out.println("Hello World line 3 ");

// if you use print instead of println your code is written onto the same line.
// It doesn't go to the next line

        System.out.print("Hello World line 4 ");
        System.out.print("Hello World line 5 ");


        System.out.println("Hello World line 6 ");
        System.out.println("Hello World line 7 ");
    }

    /*
    *
            * int num1 = 5;
            double num2 = 3.0d;
            float num3 = 3.0f;
            double result1 = num1 + num2;
            double result2 = num1 - num2;
            double result3 = num1 * num2;
            double result4 = num1 / num2;
            float result5 = num1 / num3;
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
            System.out.println(result5);
            Create a method to take above action , call it calculateMathProblem()
    * */
    public static void calculateMathProblem() {

        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }


}
