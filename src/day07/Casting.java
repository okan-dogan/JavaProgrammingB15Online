package day07;

public class Casting {

    public static void main(String[] args) {

        int a = 10;
        double b = a;
        System.out.println(b); // it turns from integer to double value.

        double c = 562.99;
        int d = (int) c;
        System.out.println(d);

        // int d = c; gives error you should use int d = (int) c;
        // you can pour your grande coffee into the venti cup,
        // but you cannot put your venti coffee into your grande cup.
        // you have to spill some of it to fit it.

        double earthToMoon = 12345.67890d;
        int moonToEarth = (int) earthToMoon;
        System.out.println(moonToEarth);



    }
}
