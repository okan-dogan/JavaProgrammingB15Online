package day44;

public class Vehicle {

    protected String make;
    int year;

    public void start(){
        System.out.println("Starting " + make);
    }

    public void goForward(){
        System.out.println(make+" is going forward");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
