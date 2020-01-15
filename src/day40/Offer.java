package day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Create Offer class with
instance fields :
location, company, salary , isFullTime
instance methods :
displayOfferDetails -- print all info about offers
Create 5 offer objects with your ideal offers with all details ,
call displayOfferDetails method on each of them
Optionally : @channel
Store them into List<Offer> then call the method.
Optionally :
Add 5000 to each offers less than 100K
 */
public class Offer {

    String location;
    String company;
    int salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     * no parameter and no return type
     */
    // inside instance method we can directly access instance variable
    public void displayOfferDetails(){
        System.out.println(location+" | "+company+" | "+salary+" | "+isFullTime);
    }

    // Write a method called turnToFullTime
    public void turnToFullTime(){
        if(!isFullTime){    // isfullTime==false
            isFullTime=true;
        }
    }


    // Write a method to change the location of the Offer
    // to the location user passed
    public void changeLocation (String newLocation){
        location=newLocation;
    }


    // Write a method to accept 4 parameters to change all info
    // about offers
    public void changeAllInfo(String newLocation, String newCompany, int newSalary, boolean newIsFullTime){
       location=newLocation;
       company=newCompany;
       salary=newSalary;
       isFullTime=newIsFullTime;
       System.out.print("After changing all the information = ");
       displayOfferDetails();
    }

    // write a method to check the offer belong to 100K club and return the result as true false

    /**
     * a method to check the offer belong to 100K club
     *
     * @return true if salary is more than 100k , false if not
     */
    public boolean is100KOffer() {
        // salary>=100000 already generate a boolean result
        // so we can directly return that result
        return salary >= 100000;

    }

    /**
     * Create an instance method called toString
     * has no parameter
     *
     * @param
     * @return String representation of Offer Object
     * <p>
     * In below format
     * [Location = Virginia , Company = Amazon | Salary = 150000 $ | isFullTime = true]
     */
    public String toString(){
        String fullInfo="Location = "+location+", Company = "+company+", Salary = "+salary+", Full Time or Not = "+isFullTime;
        return fullInfo;
    }

}
