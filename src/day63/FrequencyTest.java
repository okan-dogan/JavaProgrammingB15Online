package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTest {

    public static void main(String[] args) {


        Map<Integer, Integer> charFreq = new HashMap<>();

        charFreq.put(1,10);
        charFreq.put(2,20);
        charFreq.put(3,30);
        charFreq.put(4,40);
        charFreq.put(5,50);

        for (int x = 1; x <= charFreq.size(); x++) {

            System.out.println("charFreq.put(charFreq.get(x), charFreq.get(x)) = " + charFreq.get(x));

        }
        }


    }

