package day61;

public class Job implements Comparable<Job>{

    private String location, companyName;
    private double salary;

    public Job(String location, String companyName, double salary){
        this.location=location;
        this.companyName=companyName;
        this.salary=salary;
    }

    public String getLocation(){
        return location;
    }

    public String getCompanyName(){
        return companyName;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "Location is = "+location+
                ", Company Name is = "+companyName+
                ", Salary is = "+salary;
    }



    @Override
    public int compareTo(Job o) {
        if(this.salary>o.salary){
            return 1;
        }else if(this.salary<o.salary){
            return -1;
        }else return 0;
    }




}
