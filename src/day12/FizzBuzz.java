package day12;

public class FizzBuzz {

    public static void main(String[] args) {

        int num = 15;

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("FizzBuzz Number");
        } else if (num % 3 == 0) {
            System.out.println("Buzz Number");
        } else if (num % 5 == 0) {
            System.out.println("Fizz Number");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
