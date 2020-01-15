package repl_it;

import java.util.Scanner;

public class Repl_It_086_Party {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        String firstGuest, moreGuest, otherGuest="";
//
//        System.out.println("Please enter guest name:");
//        firstGuest = input.next();
//
//        System.out.println("Do you want to enter new guest name:");
//        moreGuest = input.next();
//
//        while (moreGuest.equalsIgnoreCase("yes")){
//            System.out.println("Please enter guest name:");
//            otherGuest = input.next();
//            firstGuest += ", " + otherGuest;
//            System.out.println("Do you want to enter new guest name:");
//            moreGuest = input.next();
//        }
//        System.out.print("Guest's list: "+firstGuest);



        String guestName ="";
        String moreGuest ="";
        do {
            System.out.println("Please enter guest name:");
            guestName += input.next()+", ";
            System.out.println("Do you want to enter new guest name:");
            moreGuest = input.next();
        }while (moreGuest.equalsIgnoreCase("yes"));
        System.out.print("Guest's list: "+guestName.substring(0,guestName.length()-2));


//        Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
//        Ask for the first guest name.
//        Then ask does user want to enter one more guest.
//        If yes - take input from.
//        If not - finish the program and print list of the guests.
//
//        Please enter guest name:
//        Nick
//        Do you want to enter new guest name:
//        yes
//        Please enter guest name:
//        Linda
//        Do you want to enter new guest name:
//        no
//        Guest's list: Nick, Linda


    }
}
