package day39;
/*
Create an ArrayList of String to store 12 elements.
Each element should contains product information separated by comma  :
at index 0 -->> iPhone 6s, 499 , 18.71 and so on
Task 1 : print only items name
Task 2 : print all the prices more than 500
Task 3 : print average price
Task 4 : print all the items name that has less than 20$ monthly payment.
Task 5 : Print the monthly payments of all the iPhone no matter what model.
Task 6 : Print all information about most expensive items.
Task 7 : Update Dyson price to 80% off
(Monthly payment should also be calculated accordingly)
Task 8 : Count the items prices more than average price.
OPTIONALLY :
Task 9 : Remove all the items has more than average price.
------------------------
Create 3 more ArrayList objects to separately store
itemNames(String), prices(Double) , monthlyPayments(Double)  :
 */
import java.util.ArrayList;
import java.util.Arrays;

public class TaskArrayList_Products_v2 {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71","iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16","MacbookPro,1499.99,79.49","ThumbDrive,39.99,2.68","Beats HeadPhones,349.99,15.12",
                "Mous,79.99,8.98","Charger,39.99,4.56","iPad,429,18.31","Dyson Vacuum,399,16.25","TV,2199,89.49",
                "Apple Watch,559,21.18"));

        System.out.println("arrList = " + arrList);
        arrList.remove(1);
        System.out.println("arrList = " + arrList);

        System.out.println("=======TASK 1========");
        System.out.print("Product names = ");
        for (int i = 0; i <arrList.size() ; i++) {
            String[] itemSplitArr = arrList.get(i).split(",");
            System.out.print(itemSplitArr[0]+", ");
        }

        System.out.println("\n=======TASK 2========");
        System.out.print("Product prices (more than $500)= ");
        double mothlyPrice=0;
        double totalPrice=0;
        for (int i = 0; i <arrList.size() ; i++) {
            String[] itemSplitArr = arrList.get(i).split(",");
            totalPrice += Double.parseDouble(itemSplitArr[1]);

            if(Double.parseDouble(itemSplitArr[1])>500){
                System.out.print(itemSplitArr[1]+", ");
            }
        }
        double averagePrice=totalPrice/arrList.size();

        System.out.println("\n=======TASK 3========");
        System.out.print("The average price is = "+averagePrice);

        System.out.println("\n=======TASK 4========");
        System.out.print("The products havimg more than $20 monthly price = ");

        for (int i = 0; i <arrList.size() ; i++) {
            String[] itemSplitArr = arrList.get(i).split(",");

            if(Double.parseDouble(itemSplitArr[2])>20){
                System.out.print(itemSplitArr[0]+", ");
            }
        }

        System.out.println("\n=======TASK 5========");
        System.out.print("The monthly price of all iPhones= ");
        for (int i = 0; i <arrList.size() ; i++) {
            String[] itemSplitArr = arrList.get(i).split(",");
            if(itemSplitArr[0].contains("iPhone")){
                System.out.print(itemSplitArr[0]+"-->>"+itemSplitArr[2]+", ");
            }
        }

        System.out.println("\n=======TASK 6========");
        System.out.print("The most expensive item = ");
        double maxPrice = 0;
        String fullInfo = "";
        for (int i = 0; i <arrList.size() ; i++) {
            String[] itemSplitArr = arrList.get(i).split(",");
            if(Double.parseDouble(itemSplitArr[1])>maxPrice){
                maxPrice=Double.parseDouble(itemSplitArr[1]);
                fullInfo = arrList.get(i);
            }
        }
        System.out.print(fullInfo);

//        for (int i = 0; i <arrList.size() ; i++) {
//            String[] itemSplitArr = arrList.get(i).split(",");
//            if(Double.parseDouble(itemSplitArr[1])==maxPrice){
//                System.out.print(itemSplitArr[0]+", total price-->"+itemSplitArr[1]+", monthly price-->"+itemSplitArr[2]);
//                //System.out.print(Arrays.toString(itemSplitArr));
//            }
//        }

        System.out.println("\n=======TASK 7========");
        System.out.print("After 80% discount, Dyson prices = ");
        double dysnPrice=0;
        double dysnMonPrice=0;
        for (int i = 0; i <arrList.size() ; i++) {
            String[] itemSplitArr = arrList.get(i).split(",");
            if(itemSplitArr[0].contains("Dyson")){
                dysnPrice=Double.parseDouble(itemSplitArr[1])*0.2;
                dysnMonPrice = Double.parseDouble(itemSplitArr[2])*0.2;
                arrList.set(i,itemSplitArr[0]+","+dysnPrice+","+dysnMonPrice);
                System.out.print(itemSplitArr[0]+", total price-->"+itemSplitArr[1]+", monthly price-->"+itemSplitArr[2]);
                System.out.print("\n"+arrList.get(i));

            }
        }

        System.out.println("\n=======TASK 8========");
        System.out.print("The items more expensive than average price = ");

        for (int i = 0; i <arrList.size() ; i++) {
            String[] itemSplitArr = arrList.get(i).split(",");
            if(Double.parseDouble(itemSplitArr[1])>averagePrice){
                System.out.print(itemSplitArr[0]+", ");
            }
        }

        System.out.println("\n=======TASK 9========");
        System.out.print("After deleting the items more expensive than average price = ");

        for (int i = 0; i <arrList.size() ; i++) {
            String[] itemSplitArr = arrList.get(i).split(",");
            if(Double.parseDouble(itemSplitArr[1])>averagePrice){
                arrList.remove(i);
                i--;
            }
        }
        System.out.println(arrList);
    }
}
