package day43;

public class CoffeeShopUtil {

    public static void main(String[] args) {

        Coffee c = new Coffee("Blonde",5,1.6);
        printCoffeeInfo(c);




    }

    public static void printCoffeeInfo(Coffee co){
        System.out.println("This Coffee is : "+co.getTypeCof()+", Price is : "+co.getPriceCof()+", Caffeine Level is : "+co.getCaffeineLev());
    }





}
