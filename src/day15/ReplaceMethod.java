package day15;

public class ReplaceMethod {

    public static void main(String[] args) {

        String message = "I love Pumpkin, Pumpkin is FUN!";

        message.replace("Pumpkin", "JAVA");
        System.out.println(message);
        System.out.println(message.replace("Pumpkin", "JAVA"));

        message = message.replace("Pumpkin", "JAVA");
        System.out.println(message);

        // all about above is about stack and heap memory

        String message2 = "Happy Thanks Giving to you all!!";

        // TASK "Happy Thanks Giving to you all"-->> Happy Thanksgiving to you all

        message2 = message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println("message2 = " + message2);
        message2 = message2.replace("!!","!");
        System.out.println("message2 = " + message2);
        message2 = message2.replace(" ","");
        System.out.println("message2 = " + message2);

        String message3 = "Tomorrow is off no!";
        message3 = message3.replace("no","");
        System.out.println("message3 = " + message3);



    }
}
