package office_hour.office_hour_01232020;

class Test {

    public Test(String str) {
        System.out.println("Name is: " + str);
    }


    public static void method() {
        int a = 100;  // local variable
        System.out.println(a);

        //  Test  obj1 = new Test(10); object MUST be created with Existing constructor
        // Test obj2 = new Test();
    }

    public static void main(String[] args) {
        method();
        //  Test("Muhammed");
        // System.out.println(a); // a is local vairable.

        Practice_01_23_2020.staticMethod();

        Practice_01_23_2020 obj = new Practice_01_23_2020();
        obj.staticMethod();  // static is shared by all the objects of the class.
        // static should be called static way: through the class name
        if (true) {
            int b = 100;
        }

        // System.out.println(b); // local variables cannot be used outside the method or blocks

        Test obj2 = new Test("Mohammed"); //

    }

}


public class Practice_01_23_2020 {

    static int stA = 10;
    String name;
    int inB;

    public static void staticMethod() {
        System.out.println("This is static method");
    }

    public static void main(String[] args) {

        //  System.out.println(name); // name is not a class member

        Practice_01_23_2020 obj1 = new Practice_01_23_2020();
        obj1.stA = 20;
        obj1.inB = 200;

        Practice_01_23_2020 obj2 = new Practice_01_23_2020();

        System.out.println(obj1.stA); //20
        System.out.println(obj2.stA); //20

        System.out.println(obj1.inB); //200
        System.out.println(obj2.inB); //0

        System.out.println("====================================");

        Practice_01_23_2020 Gunel = new Practice_01_23_2020();
        Gunel.name = "Gunel";

        Practice_01_23_2020 Yana = new Practice_01_23_2020();

        System.out.println(Gunel.name); // Gunel
        System.out.println(Yana.name); // Gunel

        // method1(); not a class member
        Practice_01_23_2020 obj3 = new Practice_01_23_2020();
        obj3.method1();


    }

    public void method1() {
        System.out.println(name);
    }


}



