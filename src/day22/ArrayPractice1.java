package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {

        double[] prices = new double[5];

        System.out.println(prices[0]);
        System.out.println(prices); // we cannot print out array variable by using its name directly

        prices[0]=2.46;
        prices[1]=12.96;
        prices[2]=992.1;
        prices[3]=500;
        prices[4]=65.123;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        char[] myName = new char[4];
        // if you don't assign any value you get as a default;

        System.out.println("<"+myName[0]+">");

        myName[0]='o';
        myName[1]='k';
        myName[2]='a';
        myName[3]='n';


        System.out.println(myName); // it is exclusive only for char you cannot get any variable using this code

        System.out.println(myName[0]);
        System.out.println(myName[1]);
        System.out.println(myName[2]);
        System.out.println(myName[3]);

        System.out.println(""+myName[0]+myName[1]+myName[2]+myName[3]);


        // boolean default value is ; false
        boolean[] yesNo = new boolean[3];

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0]=true;
        yesNo[1]=false;
        yesNo[2]=10>7;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);





    }
}
