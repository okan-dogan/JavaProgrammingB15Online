package day28;
//TASK 1. Check if all 3 arrays are exact same length
//Print "All arrays are equal length"
//TASK 2. Print how many items purchased
//System.out.println("Items count: " + ??);
//TASK 3. Print a receipt report.
        /*
            12345 - Shoes - $99.99
            ...
            458.8 * 0.06 + 458.8
            Total price: $458.8 (include tax)
         */
//TASK 4. Find/Look for "Airpods" in items and print along with price and itemID
//TASK 5. Find the most expensive item and print all details
//        double maxPrice = prices[0];
//        int maxPriceIndex = 0;
//
//        // YOUR CODE GOES HERE
//
//        // BELOW IS ALREADY WRITTEN FOR YOU
//        System.out.println("Most expensive item:");
//        System.out.println(itemIDs[maxPriceIndex] + " - " + items[maxPriceIndex] + " - "+prices[maxPriceIndex]);
public class Task3_Mall_Shopping {

    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        if(items.length==prices.length&&prices.length==itemIDs.length){
            System.out.println("All arrays are equal length");
        }
        System.out.println("Items count: " + items.length);

        System.out.println("==========================");

        double totalPrice = 0.0;
        for (int i = 0; i <items.length ; i++) {
            System.out.println(itemIDs[i]+" - "+items[i]+" - $"+prices[i]);
            totalPrice=prices[i]*0.06+prices[i];
            System.out.println("Total price: $"+totalPrice+" (include tax)");
            System.out.println("==========================");
        }

        for (int i = 0; i <items.length ; i++) {
            if(items[i].equalsIgnoreCase("Airpods")){
                System.out.println("We have Airpods: "+itemIDs[i]+" - "+items[i]+" - $"+prices[i]);
            }
        }

        double mostExpensive = prices[0];
        int tempI = 0;
        for (int i = 0; i <prices.length ; i++) {
            if(prices[i]>mostExpensive){
                mostExpensive=prices[i];
                tempI = i;
            }
        }
        System.out.println("The most expensive item is "+items[tempI]+", its ID is "+itemIDs[tempI]+" and its price is $"+mostExpensive);






    }
}


