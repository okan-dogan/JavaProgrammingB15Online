package day07;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args) {

        int apple = 10;

        System.out.println(apple);

        ++apple;

        System.out.println(apple);

        apple++;

        System.out.println(apple);

        apple = 10;

        System.out.println(++apple);
        System.out.println(apple++); // post increment increases the walue by one but it doesn't show the result
                                     // at first time. It holds the variable for the next result.
        System.out.println(apple);

        int score = 50;
        System.out.println(++score); // 51
        System.out.println(score++); // 51 and ready to be 52 for the next line
        System.out.println(score);   // 52

        System.out.println(--score); //51
        System.out.println(score--); // 51 and ready to be 50 for the next line
        System.out.println(score);

    }
}
