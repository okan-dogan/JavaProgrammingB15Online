package day34;
/*
We have two monkeys, a and b, and the parameters aSmile and bSmile
indicate if each is smiling. We are in trouble if they are both smiling or
if neither of them is smiling. Return true if we are in trouble.
For example :
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    //TODO : Your code goes here
}
 */
public class MoreMethodPractice {

    public static void main(String[] args) {

        System.out.println(monkeyTrouble(false,false));
        System.out.println(monkeyTrouble(true,false));
        System.out.println(monkeyTrouble(false,true));
        System.out.println(monkeyTrouble(true,true));



    }
//    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//        //TODO : Your code goes here
//        if(aSmile==false&&bSmile==true){
//            return false;
//        }else if(aSmile==true&&bSmile==false){
//            return false;
//        }
//        return true;
//    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile&&bSmile)||(!aSmile&&!bSmile)){
            return true;
        }
        return false;
    }




}
