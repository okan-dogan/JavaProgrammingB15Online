package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        int apple = 10;
        int orange = 10;

        apple = apple+1; // a way to add 1
        apple +=1 ;      // a shorter way to add 1
        ++ apple;        // the shortest way to add 1

        orange = orange-1; // a way to subtract 1
        orange -=1 ;       // a shorter way to subtract 1
        -- orange;         // the shortest way to subtract 1

        System.out.println(apple);
        System.out.println(orange);

    }
}
