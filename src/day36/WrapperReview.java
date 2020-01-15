package day36;

public class WrapperReview {

    public static void main(String[] args) {

        Integer i1 = new Integer(1000000000);
        Integer i2 = Integer.valueOf(123);

        // is i3 primitive type variable
        // is i3 reference type variable
        Integer i3 = 45; // --->> 45 --->> new Integer(45)

        int i4 = 54;
        // auto unboxing : wrpper type to primitive type conversion
        int i5 = new Integer(100);

        // Auto boxing and unboxing is unique feature
        // of conversion between primitive value wrapper classes objects

    }


}
