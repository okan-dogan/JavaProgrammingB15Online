package day32;

public class NumberActions {

    public static void main(String[] args) {

        numberComparision(50,90);
        numberComparision(80,25);
        numberComparision(17,17);
        stringRepeater("Hello B15",3);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(15);



    }

    /*
    numberComparision num1 num2
    if num1>num2 print 1 greater than 2
    if num2>num1 print 2 greater than 1
    if num1==num2 print equal
     */

    public static void numberComparision(int num1, int num2){
        if(num1>num2){
            System.out.println("Number1 is greater than Number2");
        }else if(num2>num1){
            System.out.println("Number2 is greater than Number1");
        }else{
            System.out.println("Numbers are equal");

        }
    }

    /*
    stringRepeater
    this method has 2 parameters String strToRepeat and int count
    repeat printing the String as many as count number
     */

    public static void stringRepeater(String strToRepeat, int count){
        for (int i = 0; i <count ; i++) {
            System.out.println(strToRepeat);
        }
    }

    /*
     * skipCountBy3From0to50
     *
     * * create a method that has no parameter
     * and skip count by 3 from 0 to 50
     *
     * countDownByEvenNumberFrom50to0
     * * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     * for example 50 , 48 , 46 .....0
     *
     * print1toX
     * * create a method that has 1 int parameter called x
     * print from 1 to that number in one line
     * print an empty line after the print.
     */


    public static void skipCountBy3From0to50(){
        for (int i = 0; i <=50 ; i++) {
            if(i%3==0){
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }

    public static void countDownByEvenNumberFrom50to0(){
        for (int i = 50; i >=0 ; i--) {
            if(i%2==0){
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }

    public static void print1toX(int number){
        for (int i = 1; i <=number ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }



}
