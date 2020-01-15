package repl_it;

import java.util.Scanner;

public class Repl_It_087_Zombie_Attack1 {

    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         int inhabitants = scan.nextInt();

         for(int i=0;;i++){
             if(inhabitants==0){
             break;
             }
             System.out.println("Day "+i+" ["+inhabitants+"]");
             inhabitants/=2;
         }
         System.out.println("---- EXTINCT ----");

    }
}
