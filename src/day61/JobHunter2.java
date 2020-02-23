package day61;

import day61.jobComparators.CoNameComp;
import day61.jobComparators.LocComp;
import day61.jobComparators.SalComp;

import java.util.*;

public class JobHunter2 {

    public static void main(String[] args) {

        Job j1 = new Job("CA", "Google", 125000);
        Job j2 = new Job("GA", "IHG", 115000);
        Job j3 = new Job("NC", "Bank of America", 120000);
        Job j4 = new Job("WA", "Amazon", 105000);
        Job j5 = new Job("GA", "Atlanta Global", 95000);
        Job j6 = new Job("TX", "Capital", 115000);
        Job j7 = new Job("GA", "CarMax", 115000);


        List<Job> jobList = new LinkedList<>(Arrays.asList(j1,j2,j3,j4,j5,j6,j7));

        System.out.println("Before Sorting Job List = " + jobList);

        // Comparator<Job> comSal = new SalComp();
        // If you don't write and add any comparator and if you have more than one same salary offer
        // it orders automatically as regards neutral order
        // but if you add .thenComparing ??????????
        Comparator<Job> comSal = Comparator.comparingDouble(p->p.getSalary());
        Collections.sort(jobList, comSal);
        System.out.println("After Sorting by Salary (ascending) = " + jobList);

        Collections.sort(jobList, comSal.reversed());
        System.out.println("After Sorting by Salary (descending) = " + jobList);

        // Comparator<Job> comLoc = new LocComp();
        Comparator<Job> comLoc = (o1,o2)->o1.getLocation().compareTo(o2.getLocation());
        Collections.sort(jobList, comLoc);
        System.out.println("After Sorting by Location = " + jobList);

        // Comparator<Job> comCoName = new CoNameComp();
        Comparator<Job> comCoName = (o1,o2)->o1.getCompanyName().compareTo(o2.getCompanyName());
        Collections.sort(jobList, comCoName);
        System.out.println("After Sorting by Company Name = " + jobList);



    }

}
