package day44;

public class Course {

    String name, type;

    static int counter;
    // it affects all the objects that will be created.
    // when you create c1 it count 1,
    // then you create c2 it increases 2,
    // ...create c5 it becomes 5.
    // if you convert it into int counter,
    // it becomes an instance variable and every time you create an object
    // it increases 1.
    // When c1 is created it becomes 1
    // when c2 is created it becomes 1
    //.... c5 it becomes 1.
    // so if you want to create a field that affects all the objects in the class
    // you need to create a static field
    // in this example if you don't create a static field with name counter
    // you cannot count how many object you have created


    public Course(String name, String type){
        this.name=name;
        this.type=type;
        counter++;
        // You can access static field
        // in constructor, instance method , static methods
    }


}
