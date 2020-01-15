package repl_it;
/*
We will be manipulating elements of an ArrayList by using List methods.

The first List method we will learn is .add()

The following code will take an ArrayList of Strings called strs and add "Hello" to it.
str.add("Hello");

The syntax follows something like:
arraylistvariable.add(data to add);

In the space to the left, add three names (any names) to the ArrayList called names.
 */


import java.util.Arrays;

public class Repl_It_192_Methods_ArrayList_Add {

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




