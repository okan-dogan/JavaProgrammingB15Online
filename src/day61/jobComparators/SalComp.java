package day61.jobComparators;

import day61.Job;

import java.util.Comparator;

public class SalComp implements Comparator <Job> {

    @Override
    public int compare(Job o1, Job o2){
        if(o1.getSalary()>o2.getSalary()){
            return 1;
        }else if(o1.getSalary()<o2.getSalary()){
            return -1;
        }else {
            return 0;
        }
    }

}
