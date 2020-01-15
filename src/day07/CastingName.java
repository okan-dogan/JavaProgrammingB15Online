package day07;

public class CastingName {

    public static void main(String[] args) {

        char o = 'O';
        char k = 'K';
        char a = 'A';
        char n = 'N';
        int numO = o;
        int numK = k;
        int numA = a;
        int numN = n;
        System.out.println(numO+" "+numK+" "+numA+" "+numN);

        int numbO = 79;
        int numbK = 75;
        int numbA = 65;
        int numbN = 78;
        char o1 = (char) numbO;
        char o2 = (char) numbK;
        char o3 = (char) numbA;
        char o4 = (char) numbN;
        System.out.println(o1+""+o2+""+o3+""+o4);

        // if you don't use "" between o1 o2 o3 o4,
        // you get a sum of the value of them in int like 79+75+65+78=297
        char t = 'T';
        System.out.println(t);
        System.out.println(t+1);
        System.out.println(""+t+1);
        // if you use "",java consider 1 as a seperate string
        // if you don't use "", you get T(equals 84 in ascii code) +1 = 85



    }
}
