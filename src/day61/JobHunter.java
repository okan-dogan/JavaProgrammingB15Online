package day61;

import java.util.*;

public class JobHunter {

    public static void main(String[] args) {

        Job j1 = new Job("CA", "Google", 125000);
        Job j2 = new Job("GA", "IHG", 115000);
        Job j3 = new Job("NC", "Bank of America", 120000);
        Job j4 = new Job("WA", "Amazon", 105000);
        Job j5 = new Job("GA", "Atlanta Global", 95000);


        List<Job> jobList = new LinkedList<>(Arrays.asList(j1,j2,j3,j4,j5));


        System.out.println("Before Sorting Job List = " + jobList);


        // How does the sort method know how to sort??
        // It use the comparing logic provided inside
        // compareTo(Job other) method
        // then sort them accordingly
        Collections.sort(jobList);

        System.out.println("After Sorting Job List = " + jobList);

        Collections.sort(jobList, Collections.reverseOrder());
        // You can also use Collections.sort(jobList, Comparator.reverseOrder());

        System.out.println("After Reversing the Order of Job List = " + jobList);

        // what's the difference between Collections.reverseOrder()
        // and Comparator.reverseOrder()
        // both of them will give you an Comparator object with reversed logic
        // they are just at two different place
        // one is the static method of Comparator interface
        // another is static method of Collections class
        // no functional difference at all , they happen to have same name

        // use iterator to iterate over List<Job>
        // remove jobs less than 100K salary

        Iterator<Job> myJobIter = jobList.iterator();

        System.out.println("myJobIter.hasNext() = " + myJobIter.hasNext());

        while(myJobIter.hasNext()){

            if(myJobIter.next().getSalary()<100000){

                myJobIter.remove();

            }
        }

        System.out.println("After iterator remove = "+jobList);

        System.out.println("myJobIter.next() = " + myJobIter.next());


    }

}
