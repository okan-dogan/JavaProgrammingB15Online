package repl_it;

import java.util.Scanner;

public class Repl_It_092_Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result=1;

        for(int i=n;i>=1;i--){
            result*=i;
        }
        if(n<=0){
            System.out.println(n);
        }else{
            System.out.println(result);
        }
    }
}
