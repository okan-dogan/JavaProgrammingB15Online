package day61.jobComparators;

import day61.Job;

import java.util.Comparator;

public class CoNameComp implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2){
        return o1.getCompanyName().compareTo(o2.getCompanyName());
    }

}
