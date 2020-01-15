package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);
        int letterInNumber = grade;
        System.out.println(letterInNumber);

        // B equals 66 in ascii table. So it turns from B to 66.

        int letterInNumber2= 6655;
        System.out.println(letterInNumber2);
        char grade2 = (char) letterInNumber2;
        System.out.println(grade2);

        char letterA = 'a';
        System.out.println(letterA);
        System.out.println(letterA+1);
        System.out.println(letterA+""+1);


        //char grade2 = int;



    }
}
