package day17;

public class CountEvenOddNumbers {

    public static void main(String[] args) {

        // even numbers 0 to 50
        // odd numbers 0 to 50

        int counter = 1;
        int counter1 = counter;
        int counter2 = counter1 + 1;
//        akbar's tactik;
//        while (counter<=50){
//
//            if(counter%2==0){
//                System.out.println(counter + " is even number");
//            }else{
//                System.out.println(counter + " is odd number");
//            }
//            counter++;
//        }

        // my tactic;
        if (counter1%2==0){
            System.out.println("Even numbers are; ");
            while (counter1<=50){
                System.out.print(counter1+" ");
                counter1+=2;
            }
            System.out.println();
            System.out.println("Odd numbers are; ");
            while (counter2<=50){
                System.out.print(counter2+" ");
                counter2+=2;
            }

        }else if (counter1%2!=0){
            System.out.println("Odd numbers are; ");
            while (counter1<=50){
                System.out.print(counter1+" ");
                counter1+=2;
            }
            System.out.println();
            System.out.println("Even numbers are; ");
            while (counter2<=50){
                System.out.print(counter2+" ");
                counter2+=2;
            }

        }
    }
}