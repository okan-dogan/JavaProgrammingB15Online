package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListUpdatedValuePractice {

    public static void main(String[] args) {

        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("Price list = "+priceList);

        // change the third price to $10
        priceList.set(2,10.0);
        System.out.println("Third item new price = "+priceList.get(2));

        // add $4 to first price : +4
        priceList.set(0,priceList.get(0)+4);
        System.out.println("First item new price = "+priceList.get(0));

        // change last price to sum of first and second price
        priceList.set(priceList.size()-1,(priceList.get(0)+priceList.get(1)));
        System.out.println("Last item new price = "+priceList.get(priceList.size()-1));

        // give 40% off to second price
        priceList.set(1, priceList.get(1)*0.6);
        System.out.println("Second item new price = "+priceList.get(1));

        System.out.println("New list after assigning new prices = "+priceList);

        // double the each price in the list
        for (int i = 0; i <=priceList.size()-1 ; i++) {
            priceList.set(i, priceList.get(i)*2);
        }

        System.out.println("List after doubling new prices = "+priceList);

        // cut half the price more than 20

        for (int i = 0; i <priceList.size() ; i++) {
            if(priceList.get(i)>=20){
                priceList.set(i,priceList.get(i)/2);
            }
        }
        System.out.println("Price list after cutting half more than $20 = "+priceList);


    }
}
