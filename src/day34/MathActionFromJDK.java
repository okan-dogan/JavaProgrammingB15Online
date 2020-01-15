package day34;

public class MathActionFromJDK {

    public static void main(String[] args) {

        /* where is String class coming from?
        it is coming from a package called java.lang
        it is a special package
        and any class in it, doesn't need importing when being used
        i.e. String class
        What if I really want to explicitly import String class
        import java.lang.String
        */
        String str = "Hello";

        /*
        There is a class under java.lang called Math
        and it has lots of math utility methods that ready to be used
         */
        int result1= Math.addExact(10,20);
        System.out.println("addExact(10,20) result1 = " + result1);
        
        int result2= Math.subtractExact(50,10);
        System.out.println("subtractExact(50,10) result2 = " + result2);




    }
}
