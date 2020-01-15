package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

        String msg = "I struggle with Java I like Java I love Java everything is Awesome!";

        int lastIndexMsg = msg.length()-1;
        int x = lastIndexMsg;

        for (int i = 0; i <=x ; i++) {
            if(i%2==1){
                continue;
            }
            System.out.print(""+msg.charAt(i));
        }

        System.out.println();

        for (int i = 0; i <=x ; i++) {
            if(msg.substring(i,i+1).equalsIgnoreCase("a")){
                break;
            }
            System.out.print(msg.substring(i,i+1));
        }
    }
}
