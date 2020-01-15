package repl_it;

import java.util.Scanner;

/*
Create a method called plus_minus that gets an array of ints (int[]),
it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1
*/
public class Repl_It_152_Methods7_PlusMinus {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);

    }

    public static void plus_minus(int[] x) {

        int counterP=0, counterN=0, counterZ=0;

        for (int i = 0; i <x.length ; i++) {
            if(x[i]>0){
                counterP++;
            }else if(x[i]<0){
                counterN++;
            }else if(x[i]==0){
                counterZ++;
            }
        }
        System.out.println("positives:"+counterP+", negatives:"+counterN+", zeros:"+counterZ);

    }


}
