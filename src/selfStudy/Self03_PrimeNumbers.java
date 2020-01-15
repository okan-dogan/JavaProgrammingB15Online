package selfStudy;

import java.util.Scanner;

public class Self03_PrimeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number");
        int num = scan.nextInt();

        for (int i = 2; i <num ; i++) {
            if(num%i!=0){
                continue;
                //System.out.print("PRIME");
            }else{
                System.out.println("NOT PRIME");
                break;
            }
            //System.out.println("PRIME");

        }
//        for (int i = 2; i <num ; i++) {
//            if(num%i!=0){
//                System.out.print("PRIME ");
//                break;
//            }
//        }

    }

}

