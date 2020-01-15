package repl_it;
/*
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
 */


import java.util.Arrays;

public class Repl_It_190_Methods_Arrays {

    public static int[] mergR(int[] a,int[] b) {
        int [] total = new int[a.length+b.length];
        for (int i = 0; i <a.length ; i++) {
            total[i]=a[i];
        }
        for (int j = 0; j <b.length ; j++) {
            total[a.length+j]=b[j];
        }
        return total;

    }//end mergR

    public static void main(String[] args){
        int [] t1 = new int[]{1,2,3};
        int [] t2 = new int[]{4,5,6};
        System.out.println(Arrays.toString(mergR(t1,t2)));

    }


}




