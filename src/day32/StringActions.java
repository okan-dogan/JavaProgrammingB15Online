package day32;

public class StringActions {

    public static void main(String[] args) {

        reversePrintMyOwnName();
        System.out.println();
        printStringWithDashInBetween("OkanDogan");
        printStringWithDashInBetween("Derya");
        printStringWithDashInBetween("YusufHalit");
        printStringWithDashInBetween("Inci");


    }


    /*
    reversePrintMyOwnName
    create a method that has no parameter
    and print your name in reversed order
     */
    public static void reversePrintMyOwnName(){
        String name = "Okan";
        for (int i = name.length() ; i>=1 ; i--) {
            System.out.print(name.substring(i-1,i));

            }
    }

    public static void printStringWithDashInBetween(String nameDash){
        for (int i = 0 ; i< nameDash.length() ; i++) {
            System.out.print(nameDash.substring(i,i+1));
            if(i!=nameDash.length()-1) {
                System.out.print("-");
            }

        }
        System.out.println();
    }

}




