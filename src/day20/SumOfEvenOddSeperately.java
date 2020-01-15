package day20;

public class SumOfEvenOddSeperately {

    public static void main(String[] args) {

        int startNum = 10;
        int endNum = 100;
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = startNum; i <=endNum ; i++) {

            if (i%2==1){
                sumOdd += i;
            }else if (i%2==0){
                sumEven += i;
            }
        }
        System.out.println("sumEven = " + sumEven);
        System.out.println("sumOdd = " + sumOdd);
    }
}
