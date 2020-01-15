package repl_it;

import java.util.Scanner;

public class Repl_It_30_ShoppingList {

    public static void main(String[] args) {

        String item1, item2, item3, report="";
        String report2 ="";
        String report3 ="";
        Double price1, price2, price3, totalPrice, item1Total, item2Total, item3Total;
        int count1, count2, count3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();

        item1Total = count1*price1;
        item2Total = count2*price2;
        item3Total = count3*price3;
        totalPrice = item1Total+item2Total+item3Total;

        if (count2>0){
            report2 = "Item2: " + item2 + " Price: " + item2Total;
        }if (count3>0){
            report3 = "Item3: " + item3 + " Price: " + item3Total;
        }

        System.out.println("Item1: " + item1 + " Price: " + item1Total+", "+report2+report3);
        System.out.println("Total price: "+totalPrice);


    }
}
