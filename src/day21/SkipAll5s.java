package day21;

public class SkipAll5s {

    public static void main(String[] args) {

        int counter = 0;

        for (int i=1; i <=100 ; i++) {

            if(i%5==0){
                counter++;
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("How many 5s have you skipped?:");
        System.out.println(counter);

    }
}
