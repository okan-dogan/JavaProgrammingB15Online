package day61.jobComparators;

import day61.Job;

import java.util.Comparator;

public class LocComp implements Comparator<Job> {

    @Override
    public int compare(Job o1, Job o2){

        return o1.getLocation().compareTo(o2.getLocation());
    }


}
