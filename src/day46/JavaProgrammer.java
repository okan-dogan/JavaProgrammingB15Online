package day46;

public class JavaProgrammer extends Programmer{

    @Override
    void code() {
        System.out.println(msg1.replace("Any","Java"));
    }

    @Override
    void test() {
        System.out.println(msg2.replace("Any","Java"));
    }
}
