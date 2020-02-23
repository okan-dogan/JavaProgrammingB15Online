package day43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        System.out.println("c1 = " + c1);

        c1.setTypeCof("Turkish Coffee");
        c1.setCaffeineLev(10);
        c1.setPriceCof(-4.99);
        System.out.println("c1 = " + c1);
        
        Coffee c5 = new Coffee("Turkish Coffee",10,-4.99);
        System.out.println("c5 = " + c5);

        Coffee c2 = new Coffee("Intensito", 9, 10);
        System.out.println("c2 = " + c2);

        Coffee c3 = new Coffee("Blonde Americano",5,2.5);
        System.out.println("c3 = " + c3);


        Coffee c4 = new Coffee("Mirra",15,-5);
        System.out.println("c4 = " + c4);



//        c1=null;
//        System.out.println("c1 = " + c1);

        // any non-primitive type can be assigned to null
        String str = null;
        Scanner scan = null;
        Coffee cx = null;

        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add(null);
        lst.add(null);




    }

}
