package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        int offerCount = 2;

        offerCount += 1;

        // ++ or -- these are used to increase or decrease for 1

        System.out.println("My offer count is "+offerCount);

        ++ offerCount; // increased by 1
        System.out.println("My offer count is "+offerCount);

        -- offerCount; // decreased by 1
        System.out.println("My offer count is "+offerCount);


    }
}
