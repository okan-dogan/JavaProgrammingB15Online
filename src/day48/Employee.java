package day48;

public abstract class Employee {

    String name;
    int id;

    public Employee() {

    }

    // WHY DO WE HAVE CONSTRUCTOR HERE
    // WE CAN NOT CREATE AN OBJECT OUT OF IT ?
    // WHAT IS THE POINT ?
    // So that sub class can reuse the code of setting id and name
    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }

    public abstract void calculateAnnualSalary();

    public abstract String toString();

}
