package day21;

public class LoopControlStatement {

    public static void main(String[] args) {

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i <=10 ; i++) {

            sum+=i;

            if(sum+i>40){
                break;
            }
        }
        System.out.println("sum is "+sum);

    }
}
