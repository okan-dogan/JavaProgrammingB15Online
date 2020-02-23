package day48;

public class HourlyEmployee extends Employee {

    double hourlyWage;
    int numsOfHours;

    public HourlyEmployee(String name, int id, double hourlyWage, int numsOfHours){
        super(name, id);
        this.hourlyWage=hourlyWage;
        this.numsOfHours=numsOfHours;
    }


    @Override
    public void calculateAnnualSalary() {
        System.out.println("Hourly Employee's annual salary is "+hourlyWage*numsOfHours);

    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "Hourly Wage = " + hourlyWage +
                ", Nums Of Hours = " + numsOfHours +
                ", Name = '" + name + '\'' +
                ", ID = " + id +
                 ", Yearly Salary " + hourlyWage*numsOfHours +
                '}';
    }
}
