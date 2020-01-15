package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {

    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg");
        superHeros.add("Flash");
        superHeros.add("Wonder Woman");
        superHeros.add("Aquaman");

        System.out.println("superHeros = " + superHeros);
        
        // do we have superman in the lsit?
        //System.out.println("superHeros.contains(\"Superman\") = "+superHeros.contains("Superman"));
        
        // does it contain an item with exact value of man
        //System.out.println("superHeros.contains(\"man\") = "+superHeros.contains("man"));
        
        // remove any heros that does not have man in the String

        /*
        for (int i = 0; i <superHeros.size() ; i++) {
            String currentHero = superHeros.get(i);
            if(!currentHero.contains("man")){
                superHeros.remove(currentHero);
            }
        }
        System.out.println("superHeros = " + superHeros);
        */

        // if you use this logic, you get Flash even if it doesnt contain any man in it
        // because after removing ArrayList is shiftint
        // so you need to come back to the current location after shifting
        // by using i-- in the if condition

        for (int i = 0; i <superHeros.size() ; i++) {
            String currentHero = superHeros.get(i);
            if(!currentHero.contains("man")){
                superHeros.remove(currentHero);
                i--;
            }
        }
        System.out.println("superHeros = " + superHeros);
        
        List<String> superHerosCopy = new ArrayList<>(superHeros);
        System.out.println("superHerosCopy = " + superHerosCopy);

        // this will create a unmodifiable list
        List<String> topics = Arrays.asList("Java","Selenium","Database","API");
        System.out.println("topics = " + topics);
        // here copying everything inside topic to topicCopy
        // and it's just regular ArrayList, we can do anything with it!!
        List<String> topicCopy = new ArrayList<>(topics);
        System.out.println("(Arrays.asList creates an unmodifiable list) topicCopy = " + topicCopy);

        //topics.add("JIRA"); //ERROR!!
        //topics.remove("Java"); //ERROR!!
        topics.set(0,"Awesome Java"); // OK!
        System.out.println("topics = \n\t" + topics);

        // HERE COPYING EVERYTHING inside topic to topicCopy
        // And it's just regular ArrayList , we can do anything with it !!!
        List<String> topicsCopy =  new ArrayList<>( topics ) ;
        topicsCopy.add("Interview Prep"); //GOOD!!
        System.out.println("topicsCopy after adding item = \n\t" + topicsCopy);

        // After Java 9  Arrays.asList(...) has been improved by List.of(...)
        // It's important to know Arrays.asList(...) because lots of company still using Java 8
        // and yes this is the simplest way to
        // create a type of unmodifiable(non-resizable) List Object (not ArrayList)
        List<String> oop = List.of("Abstraction","Encapsulation","Inheritance","Polymorphism") ;
        System.out.println("oop = " + oop);
        // and again if we want to save it into a regular ArrayList Object we can do :
        List<String> oopCopy = new ArrayList<>( oop ) ;
        // or in one shot
        List<String> oopLst = new ArrayList<>( List.of("Abstraction","Encapsulation","Inheritance","Polymorphism") ) ;
        System.out.println("oopLst in one short= " + oopLst);




    }
}
