package day46;
// access modifier in sub class
// can have same visibility or more visibility
public class SQLProgrammer extends Programmer{

    @Override
    void code() {
        System.out.println(msg1.replace("Any","SQL"));
    }

    @Override
    void test() {
        System.out.println(msg2.replace("Any","SQL"));
    }


}
