package day24;

import java.util.Arrays;

public class Task2_GroceryItems {

    public static void main(String[] args) {

//        Create a String array of 6 items to store groceryItems
//        {"apple","banana","grape","strawberry","blueberry","kiwi"}
        String[] groceryItems = { "apple", "banana", "grape", "strawberry", "blueberry", "kiwi" };
//        Create a float array of 6 float values to store prices
//        { 1.99,   0.99,    4,65,    3.89,       3.88,      2.88  }
        float[] groceryPrices = { 1.99F, 0.99F, 4,65F, 3.89F, 3.88F, 2.88F };
//        assume that the order of grocery Items match the prices in same order.
//                Do below tasks :
//        1, loop through each grocery items and print them in one line
//        1.1 print each items at odd index
//        1.2 print all items in reverse order
//        1.3 find out the index location of strawberry
//        1.4 find out the count of groceries that contains berry in the name
//        1.5 print out all the character counts of the grocery items
//        1.6 print out only those items with even character count
//        1.7 print out only those items end with letter e
//        1.8 print out only last 3 characters of all the items
//        1.9 create String variable called allItems and store all the items inside array separated by comma.

//        for (String eachItem : groceryItems) {
//            System.out.print(eachItem+", ");
        String oddIndex="";
        System.out.print("Each items on the Grocery list ; ");
        for (int i=0 ; i<groceryItems.length ;i++ ) {
            System.out.print(groceryItems[i]+", ");
            if(i%2!=0){
                oddIndex+=groceryItems[i]+", ";
            }
        }
        System.out.println();
        System.out.print("Items on the odd index are ; "+oddIndex);
        System.out.println();

        int indexStraw = 0;
        int countOfBerry = 0;
        System.out.print("Reverse order of the items on the list is ; ");
        for (int i=groceryItems.length-1 ; i>=0 ;i-- ) {
            System.out.print(groceryItems[i]+", ");
            if(groceryItems[i].equals("strawberry")){
                indexStraw = i;
            }
            if(groceryItems[i].contains("berry")){
                countOfBerry ++ ;
            }
        }
        System.out.println();
        System.out.println("Index of the strawberry is ; " + indexStraw);
        System.out.println("Count of the names containing \"berry\" is ; " + countOfBerry);

        String evenCharacters="";
        String groceryEndsE="";

        System.out.println("How many characters does have each item on the list?");
        for (int i=0 ; i<groceryItems.length ;i++ ) {
            System.out.print(groceryItems[i]+" has "+groceryItems[i].length()+" characters"+", ");
            if(groceryItems[i].length()%2==0){
                evenCharacters+=groceryItems[i]+", ";
            }
            if(groceryItems[i].endsWith("e")){
                groceryEndsE+=groceryItems[i]+", ";
            }
        }
        System.out.println();
        System.out.print("Items having even characters ; "+evenCharacters);
        System.out.println();
        System.out.print("Items ending with \"e\" ; "+groceryEndsE);
        System.out.println();


        System.out.println("Only last three characters of the items ; ");

        for (int i=0 ; i<groceryItems.length ;i++ ) {
            System.out.print(groceryItems[i].substring(groceryItems[i].length()-3,groceryItems[i].length())+", ");
        }
        System.out.println();
        System.out.println("All items on the list; "+Arrays.toString(groceryItems));


//        2, loop through each prices  and print them in one line
//        2.1 print each prices in even index
//        2.2 print only prices less that 3 dollars
//        2.3 print the sum of all the prices and get average
//        2.4 print only the second half of prices (last 3)
//        2.5 print the sum of the middle two prices
//        2.6 print only prices more than average price
//        2.7 find out max price and print out max price and  index of max price
//        2.8 find out the minimum price and index of minimum price
//        2.9 find out second max price and index(challenging)



//        3, assume that the order of grocery Items match the prices in same order do below:
//        3.1 print first item and first price in one print statement -->>  apple price is 1.99
//        3.2 print last item and last price in one print statement-->>  kiwi price is 2.88
//        3.2 print all items and prices in one for loop together
//        3.3 print only those items with price more than 3.11
//        3.4 print only those items with price more than average
//        3.5 print only those prices of grocery items that contains letter b
//        3.6 print the item name with max price
//        3.7 print the item name with min price




//        4 , Below tasks will modify array :  (for each loop should not be used, try and see why)
//        4.1 swap the value of first item in array with last item of array , swap apple with kiwi
//        4.2 use for loop to loop through your groceryItems array and modify your items like this :                        itemValue+itemCharacterCount
//        For example : {"apple5","banana6","grape5","strawberry10","blueberry9","kiwi4"}
//        4.3 increase the value of each prices by one  in prices array
//        4.4 double the value of each prices in your array 1.99-->> 1.99*2
//        4.5 triple the value of each prices if it is less than 2 1.99 -->> 1.99*3
//        4.6 now find out highest price after the modification
//        4.7 find out the most expensive item name.

    }
}
