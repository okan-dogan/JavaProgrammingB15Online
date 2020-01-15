package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {

        String memberType="Prime Member";

        double purchasePrice = 15.99d;

        int shippingFee = 5;

        if (memberType.equalsIgnoreCase("Prime Member")){
            System.out.println("Your total checkout is "+purchasePrice);
        }else if(purchasePrice>=25){
            System.out.println("Your total checkout is "+purchasePrice);
        }else {
            System.out.println("Your total checkout is "+(purchasePrice+shippingFee));
        }

    }
}
