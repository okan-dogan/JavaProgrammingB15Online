package day21;

public class DecidingWhenToStop {

    public static void main(String[] args) {

                    //01234567890
        String msg = "Hello World";
        int charCount = msg.length();
        int countOfCharToIterate = 1;  // type integer as how many character you want to get at one time
                                       // x <= charCount-n (in here n = 1)
        for (int x = 0; x <=charCount-1 ; x++) {
            System.out.println(msg.substring(x,x+1));
        }

                                       // x <= charCount-n (in here n = 3)
        countOfCharToIterate = 3;
        // x <= charCount-n
        for (int x = 0; x <=charCount-3; x++) {
            System.out.println(msg.substring(x,x+3));
        }
    }
}
