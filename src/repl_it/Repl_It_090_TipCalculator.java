package repl_it;

import java.util.Scanner;

public class Repl_It_090_TipCalculator {

    public static void main(String[] args) {

//  https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

//        Input:
//        Split:Yes
//        Number of people:4
//        Check amount:476.0
//        Service Quality:Excellent

//        Output:
//        Number of people entered: &&&&
//        Total to pay: 595.0
//        Total tip: 119.0
//        Total per person: 148.75
//        Tip per person: 29.75

        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String splitYN = scan.next();
        System.out.println("Number of people:");
        int numPeop = scan.nextInt();
        System.out.println("Check amount:");
        double chkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String servQual= scan.next();
        String enterPeop="";
        double tipRate = 0;

        for (int i = 1; i <=numPeop ; i++) {
            enterPeop+="&";
        }
        if(servQual.equalsIgnoreCase("Poor")){
            tipRate=0.05;
        }else if(servQual.equalsIgnoreCase("Fair")){
            tipRate=0.1;
        }else if(servQual.equalsIgnoreCase("Good")){
            tipRate=0.15;
        }else if(servQual.equalsIgnoreCase("Great")){
            tipRate=0.2;
        }else if(servQual.equalsIgnoreCase("Excellent")){
            tipRate=0.25;
        }

        System.out.println("Number of people entered: "+enterPeop);
        System.out.println("Total to pay: "+(chkAmount+(chkAmount*tipRate)));
        System.out.println("Total tip: "+chkAmount*tipRate);
        System.out.println("Total per person: "+((chkAmount*tipRate)+chkAmount)/numPeop);
        System.out.println("Tip per person: "+(chkAmount*tipRate)/numPeop);






    }
}
