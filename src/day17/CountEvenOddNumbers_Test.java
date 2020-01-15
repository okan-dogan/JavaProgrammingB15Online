package day17;

public class CountEvenOddNumbers_Test {

    public static void main(String[] args) {

        // even numbers 0 to 50
        // odd numbers 0 to 50

        int counter1 = 0;
        int counter = counter1;

        if (counter1 % 2 == 0) {
            System.out.println("Your number is EVEN");
            while (counter1 <= 50) {
                System.out.print(counter1 + " ");
                counter1 += 2;
            }
        } else {
            System.out.println("Your number is ODD");
            while (counter1 <= 50) {
                System.out.print(counter1 + " ");
                counter1 += 2;
            }
        }
        System.out.println("\n"+"and the others ");
        ++counter;
        while (counter<=50){
            System.out.print(counter + " ");
            counter += 2;
        }

    }
}
