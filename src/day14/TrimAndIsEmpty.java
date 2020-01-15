package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {

        String message = "      REPL IS COMING  !   ";

        System.out.println(message);
        System.out.println("message character count is "+message.length());

        message = message.trim();   // trim method trims the spaces both beginning and ending sides
                                    // not inside of the contex

        System.out.println(message);
        System.out.println("message character count is "+message.length());


    }

}
