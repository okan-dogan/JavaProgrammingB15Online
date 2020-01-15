package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskArrayList_Products_Akbar_Notes {

    public static void main(String[] args) {

        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));
        System.out.println("productLst = " + productLst);
        System.out.println("productLst element count  = " + productLst.size());

        System.out.println("-----------Task 1 for each loop ----------");
//         * Task 1 : print only items name
        // This is for each version
        for (String eachProduct : productLst) {
            // we get each product , then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct name = " + namePart);

        }
        System.out.println("\n-----------Task 1 for loop ----------");
        // This is for loop version
        for (int i = 0; i < productLst.size(); i++) {
            // we get each product by using get method of ArrayList in for loop
            // then we split by comma to split into 3 part
            // and get first part of 3 -->> NAME
            String namePart = productLst.get(i).split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }
        System.out.println("\n-----------Task 2 ----------");
//         * Task 2 : print all the prices more than 500
        for (String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);

            if (price > 500) {
                System.out.println("price = " + price);
            }

        }
        System.out.println("\n-----------Task 3 ----------");
//         * Task 3 : print average price
        double sum = 0;
        double average = 0;

        for (String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price; // sum += price ;

        }
        average = sum / productLst.size(); // sum / 12

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        System.out.println("\n-----------Task 4 ----------");
//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for (String eachProduct : productLst) {

            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (monthly < 20) {
                System.out.println(name + " " + monthly);
            }

        }
        System.out.println("\n-----------Task 5 ----------");
//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        for (String eachProduct : productLst) {

            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }

        }
        System.out.println("\n-----------Task 6 ----------with for each loop");
//         * Task 6 : Print all information about most expensive item.

        // assume first item price is max price before comparing
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        String maxPriceItem = "";

        for (String eachProduct : productLst) {

            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > maxPrice) {
                maxPrice = price;
                maxPriceItem = eachProduct;
            }

        }
        System.out.println("maxPriceItem = " + maxPriceItem);
        System.out.println("maxPriceItem is at index :  "
                + productLst.indexOf(maxPriceItem));
//        System.out.println("maxPrice = " + maxPrice);
//        System.out.println("\n-----------Task 6 ----------with product details");
        // above solution will not work
        // because we need the location of max price not the price itself
//        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
//        int maxPriceIndex = 0;
//
//        for (int i = 0; i < productLst.size(); i++) {
//
//            // this is how we get each price part of items details
//            String priceStr = productLst.get(i).split(",")[1];
//            // this is how we turn the priceString into double data type
//            double price = Double.parseDouble(priceStr);
//            if (price > maxPrice) {
//                maxPrice = price;
//                maxPriceIndex = i;
//            }
//        }
//        System.out.println("maxPriceIndex = " + maxPriceIndex);
//        System.out.println("maxPrice = " + maxPrice);
//        System.out.println("expensive item detail = "
//                + productLst.get(maxPriceIndex));

        System.out.println("\n-----------Task 7 ----------");
//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println(productLst.contains("Dyson")); // false
        System.out.println(productLst.indexOf("Dyson")); // -1
        //    System.out.println(productLst.startWith("Dyson")); // COMPILER ERROR

        // First we need to find out the element that contain word Dyson in the list
        int dysonIndex = 0; // there is only one Dyson
        for (int i = 0; i < productLst.size(); i++) {
            // checking the element start with dyson
            if (productLst.get(i).startsWith("Dyson")) {
                dysonIndex = i; // if so set the dysonIndex to that location
            }
        }
        System.out.println("dysonIndex = " + dysonIndex);
        // This is original dyson details using the index
        String dysonDetails = productLst.get(dysonIndex);
        // in order to get 80% off the price and put it back to list
        // we need the price and monthly in double format so we can do calculation
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        // Putting it back to the dysons details after doing the calculation
        // 80% off means you are paying for 20% of original price
        dysonDetails = name + "," + price * 0.2 + "," + monthly * 0.2;

        System.out.println("dysonDetails = " + dysonDetails);
        // then use the set method to set the value back to the list
        productLst.set(dysonIndex, dysonDetails);
        System.out.println("productLst = " + productLst);

        System.out.println("\n-----------Task 8 ----------");
//         * Task 8 : Count all the items with prices more than average price.
        int cnt = 0;
        for (String eachProduct : productLst) {

            double price1 = Double.parseDouble(eachProduct.split(",")[1]);
            if (price1 > average) {
                ++cnt;
            }
        }
        System.out.println("all the items with prices more than average price  = " + cnt);

        System.out.println("\n-----------Task 9 ----------");
//         * OPTIONALLY :
//         * Task 9 : Remove all the items with prices more than average price.
        for (int i = 0; i < productLst.size(); i++) {

            double price2 = Double.parseDouble(productLst.get(i).split(",")[1]);
            if (price2 > average) {

                productLst.remove(i);
                --i;
            }

        }
        System.out.println("productLst count  after removing = " + productLst.size());
        // You may also store all the items with more than average into another list
        // then use remove all method :  productLst.removeAll( newListHere)

        System.out.println("\n-----------Task Three ArrayList Objects ----------");
//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :
        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();

        for (String eachProduct : productLst) {
            // store the name part into ItemName list
            String name1 = eachProduct.split(",")[0];
            itemNames.add(name1);
            // store the name price into prices list
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);
            // store the name monthlyPart into monthlyParts list
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);

        }

        System.out.println("itemNames = " + itemNames);
        System.out.println("prices = " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);


    }


}
