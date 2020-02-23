package day47;

public class Triangle extends Shape{

//    String name;
//    int area;

    int height;
    int base;

//    public Triangle(String name) {
//        super(name);
//    }

//public Triangle(String name, int height, int base){
//    super(name); // super must be first statement in construction body
//    this.height=height;
//    this.base=base;
//}

    public Triangle(int height, int base){
        super("My Triangle"); // super must be first statement in construction body
        this.height=height;
        this.base=base;
    }

    @Override
    public void calculateArea() {
        area=(height*base)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
