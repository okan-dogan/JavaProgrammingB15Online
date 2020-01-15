package day23;

public class ForEachLoop {

    public static void main(String[] args) {
        // Here will be explained two way to get each variable from inside the Array
        // The first one;
        double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};

        for (int i = 0; i <prices.length ; i++) {
            
            double eachPrice = prices[i];
            System.out.println("eachPrice " + "for "+ i + " = " + eachPrice);
                
        }
        System.out.println();
        // The second way;
        // this way below gives the exactly the same result with the above
        for (double pricesOfEach : prices){
            System.out.println("pricesOfEach = " + pricesOfEach);
        }
        // "For Each loop" can only be used for Array
        // There is no infinite loop ever in "For Each Loop"
        
    }
}
