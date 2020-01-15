package day21;

public class OddNumberPrintRepetition {

    public static void main(String[] args) {

        for (int i = 0; i <=4 ; i++) {
            System.out.println("Repeat (iteration) "+i+" : ");

            for (int j = 0; j <=10 ; j++) {
                if(j%2==0){
                    continue;
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
