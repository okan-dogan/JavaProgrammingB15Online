package day47;

public class Rectangle extends Shape {

    //    String name;
//    int area ;
    int width;
    int height;

//    public Rectangle(String name) {
//        super(name);
//    }

//public Rectangle(String name, int height, int width){
//    super(name); // super must be first statement in construction body
//    this.height=height;
//    this.width=width;
//}

    public Rectangle(int width, int height) {
        // I want to set the name to word Rectangle;
        // i am reusing the functionality of super class
        // to set the name to rectangle
        super("my rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = width * height;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}