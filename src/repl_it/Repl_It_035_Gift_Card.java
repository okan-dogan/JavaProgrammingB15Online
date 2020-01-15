package repl_it;

import java.util.Scanner;

public class Repl_It_035_Gift_Card {

    public static void main(String[] args) {

//        Let's say I've got a 100$ gift card and you want to buy something in your online store .
//        Write a program that will help me to buy something and display leftover balance after purchase.
//        If item is not in the list, display message: "Invalid item!".
//        If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".

//        Example #1
//        input: Hat
//        output: Thank you for your purchase!
//        output: Your current balance is: 75$
//
//        Example #2
//        input: Pants
//        output: Thank you for your purchase!
//        output: Your current balance is: 50$
//
//        Example #3
//        input: Laptop
//        output: Sorry, not enough funds on your gift card!
//
//        Example #4
//        input: Cupcake
//        output: Invalid item!

        int currentBalance=100;
        int smartphoneP=300;
        int laptopP=400;
        int chargerP=15;
        int usbCableP=10;
        int headphonesP=30;
        int pantsP=50;
        int hatP=25;
        int socksP=5;
        int blanketP=60;
        int pillowP=40;
        String itemName="";
        String smartphone="Smartphone";
        String laptop="Laptop";
        String charger="Charger";
        String usbCable="USB cable";
        String headphones="Headphones";
        String pants="Pants";
        String hat="Hat";
        String socks="Socks";
        String blanket="Blanket";
        String pillow="Pillow";
        Scanner item = new Scanner(System.in);
        System.out.println("What would you like to buy?");

        itemName=item.nextLine();

        if  (!( itemName.equals("Smartphone") || itemName.equals("Laptop") || itemName.equals("Charger") ||
                itemName.equals("USB cable") || itemName.equals("Headphones") || itemName.equals("Pants") ||
                itemName.equals("Hat") || itemName.equals("Socks") || itemName.equals("Blanket") ||
                itemName.equals("Pillow") ) ){
            System.out.println("Invalid item!");
        }else if ( itemName.equals("Smartphone") || itemName.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(itemName.equals("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(currentBalance-chargerP)+"$");
        }else if(itemName.equals("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(currentBalance-usbCableP)+"$");
        }else if(itemName.equals("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(currentBalance-headphonesP)+"$");
        }else if(itemName.equals("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(currentBalance-pantsP)+"$");
        }else if(itemName.equals("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(currentBalance-hatP)+"$");
        }else if(itemName.equals("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(currentBalance-socksP)+"$");
        }else if(itemName.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(currentBalance-blanketP)+"$");
        }else if(itemName.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(currentBalance-pillowP)+"$");
        }


    }
}
