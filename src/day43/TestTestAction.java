package day43;

import day09.Test;

public class TestTestAction {

    public static void main(String[] args) {

        TestTest t1 = new TestTest();
        System.out.println("t1 = " + t1);
//        t1="Okan";
// you cannot directly assign a String into
// t1 object because t1 is a object of TestTest Class so it has its unique data type
// the data type is TestTest




        TestTest t2 = new TestTest("Test2");
        System.out.println("t2 = " + t2);



        TestTest t3 = new TestTest();
        System.out.println("t3 = " + t3);
        t3.setAbc("Test3");
        System.out.println("t3 = " + t3);


    }
}
