package office_hour.ofice_hour_01132020;

public class Person {

    String firstName;
    String lastName;
    String DOB;


    public void setAllValues(String newFN, String newLN, String newDOB){
        firstName=newFN;
        lastName=newLN;
        DOB=newDOB;
    }

    @Override
    public String toString() {
        return "Person ==> " + "First Name = " + firstName  + ", Last Name = " + lastName + ", Date of Birth = " + DOB;
    }

    public void printInfo(){
        System.out.println(String.format("Person ==> First name = %s, Last Name = %s, Date of Birth = %s",firstName, lastName, DOB));
    }
}
