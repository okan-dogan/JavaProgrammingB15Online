package day62;
/*
        Create a Set of String called states
        add bunch of states with some duplicate
        iterate over them using each and every way you know
 */
import java.util.*;

public class SetOfUniqueStates {

    public static void main(String[] args) {

        List<String> stateLst = new ArrayList<>(Arrays.asList("NY","FL","GA","VA","GA","PA","GA","NY","NC","PA","CA","FL","GA"));

        // all Collection type has addAll method
        // states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));

        // any type of collection has size method to count the item
        System.out.println("stateLst = " + stateLst);
        System.out.println("stateLst.size() HOW MANY STATES DO I HAVE? = " + stateLst.size());

        Set<String> statesSet = new HashSet<>(stateLst);

        System.out.println("statesSet = " + statesSet);
        System.out.println("After HashSet stateSet.size() HOW MANY STATES DO I HAVE? = " + statesSet.size());

// FOR LOOP DOES NOT WORK!!!! NO INDEX!!!!!!!!!
// We can use iterator for any type of collection at all time

//        // creating iterator
//        Iterator<String> stIter = states.iterator();
//
//        while( stIter.hasNext()  ){
//            System.out.println("stIter.next() = " + stIter.next());
//        }
//        states.forEach(each -> System.out.println("each state = " + each));





    }

}
