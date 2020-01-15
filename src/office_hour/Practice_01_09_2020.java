package office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice_01_09_2020 {

    public static void main(String[] args) {

        int [] arr = new int[5];

        List<Integer> list = new ArrayList<>();
        list.add(10);                   // auto-boxing [10]
        list.add(20);                   // [10,20]
        list.add(1,30);  // [10,30,20]

        System.out.println(list.size()); // 2

        int num = list.get(1); // unboxing
        System.out.println(num); // 30

        list.clear(); // []
        System.out.println(list.size());  // 0

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.set(0,"B");
        System.out.println(list2); // [B]

        boolean result = list2.contains("C");
        System.out.println(result);  // false

        System.out.println(list2.equals(list)); // false

        System.out.println(list.isEmpty());   // true
        System.out.println(list2.isEmpty());  // false

        System.out.println(list2.indexOf("B")); // 0
        System.out.println(list2.indexOf("D")); // -1 the given Object is not exist in Array



        /*
        remove method is overloaded method
        it removes index or object
        if you assign a primitive (int) and want to use remove method,
        it removes the index that is indicated by that number
        if you assign a Wrapper Class (Integer) and want to use remove method,
        it removes the Integer that exists in the List (whichever index number it has)
        */

        List<Integer> list3 = new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);   // [1,2,3]

        int a1 = 1;
        list3.remove(a1); // it removes the 1st index so 2 goes

        Integer a2 = 3;
        list3.remove(a2); // it removes the 3 which exists in 1st index

        System.out.println(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("B");
        list4.add("B");
        list4.add("C");
        list4.add("D");

        list4.remove(4); // it removes D which exists in 4th index
        list4.remove("B");  // it removes the 1st B (from left to right)

        System.out.println(list4);

        /*
        int [] nums1 = {1,2,3,4,5,6,7,8};
        List<Integer> list5 = Arrays.asList(nums);
        it gives error because List can store non-primitive data
        so you need to use class like Integer [] nums1 = {1,2,3,4,5,6,7,8};
         */

        Integer [] nums = {1,2,3,4,5,6,7,8};
        List<Integer> list5 = Arrays.asList(nums);
        System.out.println(list5);

        String [] students = {"Nursultan", "Irina", "Dilshat", "Roksana"};
        List<String> names = new ArrayList<>(); // you can also use new ArrayList<>( Arrays.asList(students) );
        names.addAll(Arrays.asList(students));
        names.addAll(Arrays.asList("Mohammad","Bulent","Mustafa"));

        System.out.println(names);

        List<String> grades = new ArrayList<>();
        grades.addAll(Arrays.asList("A","A","B","C","D","E","F"));
        System.out.println(grades);

        grades.removeAll(Arrays.asList("A","C"));
        System.out.println(grades);

        grades.retainAll(Arrays.asList("B","D")); // basically it is the opposite of removeAll
        System.out.println(grades);

        /*
        interview question
        given name list : Ahmet, John, Ahmet, Eric, Ahmet, Aeron, Ahmet
        1- remove all the Ahmets
        2- keep only Ahmets
         */

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet","John", "Ahmet", "Eric", "Ahmet", "Aeron", "Ahmet"));
        System.out.println(employees);
        employees.removeAll(Arrays.asList("Ahmet"));  // removes Ahmets
        System.out.println(employees);

        List<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmet","John", "Ahmet", "Eric", "Ahmet", "Aeron", "Ahmet"));
        System.out.println(employees2);
        employees2.retainAll(Arrays.asList("Ahmet"));  // keeps Ahmets
        System.out.println(employees2);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        Collections.sort(nums2);
        System.out.println(nums2);






    }


}
