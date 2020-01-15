package office_hour;

import java.util.Scanner;

public class Practice_11_26_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String order = "";

        System.out.println("Would you like food or drink?");
        order = scan.next();

        if (order.equalsIgnoreCase("food")){
            System.out.println("Would you like to eat snack or meal?");
            order= scan.next();
            if (order.equalsIgnoreCase("snack")){
                System.out.println("You have ordered snack");
            }else{
                System.out.println("You have ordered meal");
            }
            System.out.println("enjoy it");

        }else if(order.equalsIgnoreCase("drink")){
            System.out.println("Would you like to drink coke or milk?");
            order= scan.next();
            if (order.equalsIgnoreCase("coke")){
                System.out.println("You have ordered coke");
            }else{
                System.out.println("You have ordered milk");
            }
            System.out.println("enjoy it");

        }else{
            System.out.println("There is no such that option");

        }





    }
}
