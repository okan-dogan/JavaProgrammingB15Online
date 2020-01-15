package day37;

import java.util.ArrayList;
import java.util.List;

/*
Create an ArrayList of Integer and fill it up with 1-100
 */
public class ListPracticeWithLoopAndInsertingNewValues {

    public static void main(String[] args) {

        List<Integer> nums1To100 = new ArrayList<>();

        for (int i = 1; i <=100 ; i++) {
            nums1To100.add(i);
        }

        System.out.println("List after creating by loop = "+nums1To100);

        // change all the odd number value to 0
        for (int i = 0; i <nums1To100.size() ; i++) {
            if(nums1To100.get(i)%2==1){
                nums1To100.set(i, 0);
            }
        }
        System.out.println("New list after assigning 0 to odds = "+nums1To100);

        // how to find index of 20
        System.out.println("Index of 20 : nums1To100.indexOf(20) = "+nums1To100.indexOf(20));

        // insert 100 to first index
        nums1To100.add(0,100);
        System.out.println("nums1To100 = " + nums1To100);

        System.out.println("After adding 100 into index 0 Index of 20 : nums1To100.indexOf(20) = "+nums1To100.indexOf(20));

        // add 100 right after index of 34, you don't know the location of 34
        nums1To100.add(nums1To100.indexOf(34)+1,100);
        System.out.println("After adding 100 right after index of 34 = " + nums1To100);

        // add five 100 in front of 44
        for (int i = 0; i <5 ; i++) {
            nums1To100.add(nums1To100.indexOf(44),100);
        }
        System.out.println("After adding 100 5 times before index of 44 = " + nums1To100);
    }
}
