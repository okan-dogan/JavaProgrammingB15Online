package day19;

public class FindingTheCountOfSomething_FizzBuzz {

    public static void main(String[] args) {

        int counter = 0;

        for(int i=1;i<=100;i++){

            if (i%15==0){
                System.out.print(i+" ");
                ++counter;
            }

        }
        System.out.println();
        System.out.println("counter = " + counter);;

    }
}
