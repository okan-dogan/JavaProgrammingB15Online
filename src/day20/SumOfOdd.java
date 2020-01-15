package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        int startNum = 10;
        int endNum = 100;
        int sumOdd = 0;

        for (int i = startNum; i <=endNum ; i++) {

            if (i%2==1){
                sumOdd += i;
            }
        }
        System.out.println("sumOdd = " + sumOdd);

    }
}
