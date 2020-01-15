package day17;

public class WakeUpTask1_NameCorrector {

    public static void main(String[] args) {

        String name = "oKAn";

        String name2 = name.toLowerCase();
        String name3 = name.toUpperCase();
        System.out.println(name3.charAt(0)+name2.substring(1));
        System.out.println(name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase());



//        Scanner scan = new Scanner(System.in);
//​
//        System.out.println("Please enter your name:");
//        String name = scan.nextLine();
//​
//        String name2 = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
//​
//        System.out.println("name2 = " + name2);
//​
//        int firstSpace = name.indexOf(" ");
//        String name3 = name.substring(0,1).toUpperCase() + name.substring(1, firstSpace).toLowerCase() + " "
//        + name.substring(firstSpace+1,firstSpace+2).toUpperCase() + name.substring(firstSpace+2).toLowerCase();
//        System.out.println("name3 = " + name3);


    }
}
