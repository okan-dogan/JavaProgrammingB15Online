package day13;

public class WarmUp_AmazonShippingCalculator_v2 {

    public static void main(String[] args) {

        String memberType="Prime Member";

        double purchasePrice = 15.99d;

        int shippingFee = 0;

        if (memberType.equalsIgnoreCase("Prime Member")){
            System.out.println("Your total checkout is "+purchasePrice);
        }else if(purchasePrice>=25){
            System.out.println("Your total checkout is "+purchasePrice);
        }else {
            shippingFee = 5;
            purchasePrice+=shippingFee; // purchasePrice=purchasePrice+shippingFee;
            System.out.println("Your total checkout is "+purchasePrice);
        }

    }
}
