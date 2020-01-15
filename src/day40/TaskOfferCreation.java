package day40;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskOfferCreation {

    public static void main(String[] args) {

        Offer o1 = new Offer();
        Offer o2 = new Offer();
        Offer o3 = new Offer();
        Offer o4 = new Offer();
        Offer o5 = new Offer();
        Offer o6 = new Offer();
        Offer o7 = new Offer();

        o1.location="Atlanta";
        o1.company="Apple";
        o1.salary=100000;
        o1.isFullTime=true;

        o2.location="Boston";
        o3.company="Google";
        o2.salary=105000;
        o2.isFullTime=true;

        o3.location="New York";
        o3.company="M&M";
        o3.salary=95000;
        o3.isFullTime=false;

        o4.location="Florida";
        o4.company="DELL";
        o4.salary=110000;
        o4.isFullTime=true;

        o5.location="San Francisco";
        o5.company="Supercell";
        o5.salary=85000;
        o5.isFullTime=false;

        o6.location="San Francisco";
        o6.company="Supercell";
        o6.salary=85000;
        o6.isFullTime=false;



        List<Offer> offerList = new ArrayList<>(Arrays.asList(o1,o2,o3,o4,o5));

        System.out.println(offerList.toString());
        System.out.println(o1);

        // there is no difference between;
        // List<Offer> offerList = new ArrayList<>(Arrays.asList(o1,o2,o3,o4,o5));
        // and List<Offer> offerList = new ArrayList<>();
        // offerList.add(01);
        // offerList.add(o2);
        // offerList.add(o3);
        // offerList.add(o4);
        // offerList.add(o5);
        // both are the same

        //List<Offer> offerList2 = Arrays.asList(o1,o2,o3,o4,o5);
        // Arrays.asList(o1,o2,o3,o4,o5) is immutable you cannot change its size
        // If you want to make some edition on it you have to copy it
        // into another list with:
        //List<Offer> offerList2Copy = new ArrayList<>(offerList2);
        //After that you are able to make changes


        //offerList2Copy.add(o6);
        //System.out.println(offerList2Copy);



        for (Offer each: offerList) {
            each.displayOfferDetails();
        }

        for (Offer each : offerList) {
            if(each.salary<100000){
                each.salary+=5000;
            }
        }
        System.out.println(o3.salary);

        o4.turnToFullTime();
        o5.turnToFullTime();
        System.out.println("o4 is full time = "+o4.isFullTime+", "+"o5 is full time = "+o5.isFullTime);

        o1.changeLocation("Washington");
        o2.changeLocation("Chicago");
        System.out.println("o1 after changing location = "+o1.location+", "+"o2 after changing location = "+o2.location);

        o3.changeAllInfo("Virginia","HP",110000,true);

        String o5Str = o5.toString();
        System.out.println(o5Str);
        // System.out.println(o5.toString()); or directly

    }
}
