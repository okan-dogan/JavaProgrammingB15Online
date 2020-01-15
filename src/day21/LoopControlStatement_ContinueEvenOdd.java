package day21;

public class LoopControlStatement_ContinueEvenOdd {

    public static void main(String[] args) {

        int num = 0;

        for (int i = 0; i <=10 ; i++) {

            if (i%2==1){
                continue;
            }
            System.out.println("even number: "+i);
        }

        for (int i = 0; i <=10 ; i++) {

            if (i%2==0){
                continue;
            }
            System.out.println("odd number: "+i);
        }


    }
}
