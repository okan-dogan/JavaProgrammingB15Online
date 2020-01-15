package day11;

public class LogicalOperator_SingleAmpersand {

    public static void main(String[] args) {

        //combine the result of checking 10 is more than 5 or 9 divided by 0 is 3

        System.out.println( 5 > 10 && 9 / 0 == 3);
        System.out.println( 5 > 10 & 9 / 0 == 3);

    }
}
