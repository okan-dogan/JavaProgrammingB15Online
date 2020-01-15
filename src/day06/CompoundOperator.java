package day06;

public class CompoundOperator {

    public static void main(String[] args) {

        // '+='  '-='  '*='  '/='  '%='  are shorthand operator

        int studentOnline = 263;
        studentOnline = studentOnline + 5; // studentOnline += 5; also gives the same result

        System.out.println("5 people have joined the class "+studentOnline);

        studentOnline = studentOnline - 13; // studentOnline -= 13; also gives the same result

        System.out.println("13 people have left the class "+studentOnline);

        studentOnline = studentOnline*2; // studentOnline *= 2; also gives the same result

        System.out.println("The people have doubled the class "+studentOnline);


    }
}
