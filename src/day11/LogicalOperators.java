package day11;

public class LogicalOperators {

    public static void main(String[] args) {

        int a = 70;
        int b = 10;
        int c = 110;
        int d = 99;
        int f = 50;

//        System.out.println(a>60 && a<100);
//        System.out.println(b>60 && b<100);
//        System.out.println(c>60 && c<100);
//        System.out.println(d>60 && d<100);
//        System.out.println(f<100 && f>60);
//
//        System.out.println(a<60 || a>100);
//        System.out.println(b<60 || b>100);
//        System.out.println(c<60 || c>100);
//        System.out.println(d<60 || d>100);
//        System.out.println(f>100 || f<60);

        System.out.println( "TRUTH TABLE :");
        System.out.println( "RESULT OF true && true  is " +   (true && true)    ); // true
        System.out.println( "RESULT OF false && true  is " +  (false && true)   ); // false
        System.out.println( "RESULT OF true && false  is " +  (true && false)   ); // false
        System.out.println( "RESULT OF false && false  is " + (false && false)  ); // false
        System.out.println( "RESULT OF true || true  is " +   (true || true)    ); // true
        System.out.println( "RESULT OF false || true  is " +  (false || true)   ); // true
        System.out.println( "RESULT OF true || false  is " +  (true || false)   ); // true
        System.out.println( "RESULT OF false || false  is " + (false || false)  ); // false


    }
}
