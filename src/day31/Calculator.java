package day31;

public class Calculator {

    public static void main(String[] args) {

        // create a static method that add
        // it accepts 2 numbers and print the result of addition
        System.out.println("Adding 2 numbers====>>>");
        add2num(6,23);
        add2num(16,3);
        add2num(1,6);
        System.out.println("Adding 3 numbers====>>>");
        add3num(6,23,10);
        add3num(16,3,5);
        add3num(1,6,4);
        System.out.println("Adding 3 numbers and a String====>>>");
        addNumString(6,23,10,"Okan");
        addNumString(16,3,5,"Derya");
        addNumString(1,6,4,"YusufHalit and Inci");


    }

    public static void add2num(int num1, int num2){
        System.out.println("Addition result for add2num "+(num1+num2));
    }

    public static void add3num(int num1, int num2, int num3){
        System.out.println("Addition result for add3num "+(num1+num2+num3));
    }

    public static void addNumString(int num1, int num2, int num3, String name){
        System.out.println("Addition result for addNumString "+(num1+num2+num3)+" and my String is "+name);
    }

}
