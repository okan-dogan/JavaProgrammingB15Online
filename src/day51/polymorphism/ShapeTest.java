package day51.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {


        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();
        Shape s4 = new Oval();
        Shape s5 = new Pentagon();

        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
        s5.draw();


        System.out.println("==== I'm creating an Array out of the IS-A Shape Objects ====");

        Shape[] shapeArray = new Shape[]{s1,s2,s3,s4,s5};
  //      Shape[] shapeArray2 = {s1,s2,s3,s4,s5};

        for (Shape eachShape : shapeArray) {
            eachShape.draw();
        }


        System.out.println("==== I'm creating an Array List out of the IS-A Shape Objects ====");

        List<Shape> shapeLst = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5)) ;
  //      List<Shape> shapeLst2 = Arrays.asList(s1,s2,s3,s4,s5);




    }


}