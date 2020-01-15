package day17;

public class BackwardOddNumberFinder {

    public static void main(String[] args) {

        int counter = 99;

        while (counter>=0){

            if (counter%2!=0){
                System.out.print(counter+ " ");
            }
            --counter;


        }

    }
}
