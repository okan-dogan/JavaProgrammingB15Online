package day24;

import java.util.Arrays;

public class ArraysClassMethod {


    public static void main(String[] args) {

        String[] superHeros = {"Superman" , "Batman" , "Wonder Woman" , "Aquaman" , "Cyborg" , "Flash"};

        System.out.println("Super Heros without anything doesn't work");
        System.out.println(superHeros);
        System.out.println();

        System.out.println("Arrays.toString(superHeros) is printed directly");
        System.out.println(Arrays.toString(superHeros));
        System.out.println();

        System.out.println("Arrays.toString(superHeros) is printed after putting it in superHerosAsString");
        String superHerosAsString = Arrays.toString(superHeros);
        System.out.println(superHerosAsString);
        System.out.println();

        System.out.println("Printing the charAt(0) of the superHerosAsString = ");
        System.out.println(superHerosAsString.charAt(0));
        System.out.println();

        int[]numbers={10,44,55,3,78};
        System.out.println("Arrays.toString(numbers) result is; ");
        System.out.println(Arrays.toString(numbers));
        System.out.println();

// create an double array of 3 items ; and put 3 value
// get a string representation out of this array and save it as pricesString
// print each and every character in this String  in this format
//  character at index 1 is :  yourCharacterHere
//  character at index 2 is :  yourCharacterHere and so on all the way till last
        double[] doubleArray = {10d, 20d, 30d};
        String priceString = Arrays.toString(doubleArray);
        for (int i = 0; i <priceString.length() ; i++) {
            System.out.println("Character at index "+i+" is : "+priceString.charAt(i));

        }
    }
}
