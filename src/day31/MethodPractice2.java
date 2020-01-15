package day31;

public class MethodPractice2 {
    /*
    Write a piece of reusable code to count from 1 to 10
    give a name count1to10                                  : method name
    no need for object when being called                    : static
    it should be accessible anywhere in your project        : public
    it doesn't return any value                             : void
    doesn't need any external data when being called        : (nothing inside)

     */

    public static void count1to10(){
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    // DOES NOT MATTER WHERE YOU PUT THE METHOD
    // AS LONG AS IT'S INSIDE THE CLASS { }
    // AND OUTSIDE ANY OF THE METHOD

    public static void main(String[] args) {
        count1to10();
        // System.out.println();
        count1to10();
        MethodPractice2.count1to10();

        countDownFrom20();

        printOddNumbers1to100();

        spellAName("OKANDOGAN");

    }


    public static void countDownFrom20(){
        for (int i = 20; i >=0 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printOddNumbers1to100(){
        for (int i = 0; i <=100 ; i++) {
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void spellAName(String yourName){
        String defaultName="";
        for (int i = 0; i <yourName.length() ; i++) {
            defaultName+=yourName.substring(i,i+1)+"->";
        }
        defaultName=defaultName.substring(0,defaultName.length()-1);
        System.out.println(defaultName);

    }


}
