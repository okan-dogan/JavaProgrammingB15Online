package day62;

import day61.Job;

import java.util.*;

public class JobTreeSet {

    public static void main(String[] args) {

        // We want the jobs automatically sorted by natural order( salary)
        // while we are adding them into the Collection object
        // so we chose SortedSet for this.

        // Create a SortedSet of Job(from day 61) with TreeSet implementation
        // add 5 jobs and print them out vertically and see what you get

        Job j1 = new Job("CA", "Google", 125000);
        Job j2 = new Job("GA", "IHG", 115000);
        Job j3 = new Job("NC", "Bank of America", 120000);
        Job j4 = new Job("WA", "Amazon", 105000);
        Job j5 = new Job("GA", "Atlanta Global", 95000);
        Job j6 = new Job("TX", "Capital", 115000);
        Job j7 = new Job("GA", "CarMax", 115000);


        List<Job> jobList = new LinkedList<>(Arrays.asList(j1,j2,j3,j4,j5,j6,j7));

        SortedSet<Job> myJobTreeSet = new TreeSet<>(jobList);
        // TreeSet<Job> myJobTreeSet = new TreeSet<>(jobList);

        for (Job eachJob : myJobTreeSet) {
            System.out.println("Each Job = "+eachJob);

        }

        // How does HashSet decide 5 Person object (name,age) are duplicate or not
        // get the most paying job Company Name and Location
        Job bestSalaryJob = myJobTreeSet.last();
        System.out.println("Best Salary Job Company Name = " + bestSalaryJob.getCompanyName()
                + ",  Located at " + bestSalaryJob.getLocation());

        // DUPLICATE SALARIES ARE GONE !!!!!!!!!!


    }


}
