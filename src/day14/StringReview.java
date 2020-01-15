package day14;

public class StringReview {

    public static void main(String[] args) {

        String str = "I like Pumpkin";
        System.out.println("str");
        System.out.println(str);

        System.out.println(str.equals("pumpkin"));

        // contains :
        // it checks whether a string exists in another string
        //and return true or false result
        System.out.println("Does it contain 'Pumpkin'?");
        System.out.println(str.contains("Pumpkin"));
        boolean  gotPumpkin = str.contains("Pumpkin");
        //shortcut to print variable value in nice format 'soutv+tab'
        System.out.println("gotPumpkin = "+gotPumpkin);

        //startsWith   endsWith
        //check whether a string starts with another string
        //check whether a string ends with another string
        //and return true or false result

        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);






    }
}
