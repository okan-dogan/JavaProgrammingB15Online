package repl_it;

import java.util.Scanner;

public class Repl_It_94_ShoppingList2 {

    public static void main(String[] args) {

//        Example:
//
//        output: Enter Item1 and its price:
//        input: Tomatoes
//        input: 5.5
//        output: Add one more item?
//        input: yes
//        output: Enter Item2 and its price:
//        input: Cheese
//        input: 3.5
//        output: Add one more item?
//        input: yes
//        output: Enter Item3 and its price:
//        input: Apples
//        input: 6.3
//        output: Add one more item?
//        input: no
//        output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
//        output: Total price: 15.3

        String item = "", addMore="", report="";
        Double price=0.0, totalPrice=0.0;

        Scanner scan = new Scanner(System.in);
        int i = 1;

        do{
            System.out.println("Enter Item"+i+" and its price:");
            item = scan.next()+" ";
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            addMore = scan.next();
            report+="Item"+i+": "+item+"Price: "+price+", ";
            totalPrice+=price;
            if(addMore.equalsIgnoreCase("YES")){
                i++;
            }else if (addMore.equalsIgnoreCase("NO")){
                break;
            }
        }while(i<=10);

        System.out.println(report.substring(0,report.length()-2));
        System.out.println("Total price: "+totalPrice);


    }
}
