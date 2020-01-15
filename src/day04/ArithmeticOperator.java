package day04;

public class ArithmeticOperator {

    public static void main(String[] args) {


        System.out.println( 5 + 3 );
        System.out.println( 5 - 3 );
        System.out.println( 5 * 3 );
        System.out.println( 5 / 3 );   // arithmetic operator works between only integer int

        System.out.println( 5 + 3.0d );
        System.out.println( 5 - 3.0d );
        System.out.println( 5 * 3.0d );
        System.out.println( 5 / 3.0f );
        System.out.println( 5 / 3.0d );


        System.out.println( 5.0 + 3 );
        System.out.println( 5.0 - 3 );
        System.out.println( 5.0 * 3 );
        System.out.println( 5.0 / 3 );
        //

       int numA = 5;
       double numB = 3.0d;
       float numC = 3.0f;

        double resultA = numA + numB;
        double resultB = numA - numB;
        double resultC = numA * numB;
        double resultD = numA / numB;
        double resultE = numA / numC;

        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
        System.out.println(resultD);
        System.out.println(resultE);



        int num1 = 5;
        int num2 = 3;
        double num1d = 5.0d;
        double num2d = 3.0d;
        float num2f = 3.0f;

        int result1 = num1+num2;
        double result1d = num1+num2;
        double result2 = num1d+num2d;
        double result3 = num1*num2d;
        double result4 = num1/num2;
        double result5 = num1/num2f;
        float result5f = num1/num2f;
        double result6 = num1/num2d;

        System.out.println(result1);
        System.out.println(result1d);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result5f);
        System.out.println(result6);

    }
}
