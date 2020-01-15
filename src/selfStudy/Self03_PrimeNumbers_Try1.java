package selfStudy;

import java.util.Scanner;

public class Self03_PrimeNumbers_Try1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number");
        int num = scan.nextInt();
        int counter=0;

        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                counter++;
            }
        }
        if(counter==0){
            System.out.println("PRIME");
        }else {
            System.out.println("NOT PRIME");
        }

    }
}





