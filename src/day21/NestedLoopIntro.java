package day21;

public class NestedLoopIntro {

    public static void main(String[] args) {

        // count from 1 to 5
        // repeat this 10 times

        for (int i = 1; i <=10 ; i++) {

            System.out.println("Repeat (iteration) "+i+" : ");

            for (int j = 1; j <=5 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
