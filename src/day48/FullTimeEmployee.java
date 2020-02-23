package day48;

public class FullTimeEmployee extends Employee {

    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary=monthlySalary;
    }


    @Override
    public void calculateAnnualSalary() {
        System.out.println("Full Time Employee's annual salary is "+monthlySalary*12);

    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "Monthly Salary = " + monthlySalary +
                ", Name = '" + name + '\'' +
                ", ID=" + id +
                ", Yearly Salary " + monthlySalary*12 +
                '}';
    }
}
