package day16;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {

        //             012345678901234567890123456789012
        String name = "I love Java I Love Java Java Java";

        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java",7));
        // it is still getting 7 as first Java's starting point is 7
        System.out.println(name.indexOf("Java",8));
        System.out.println(name.indexOf("Java",9));
        System.out.println(name.indexOf("Java",19));
        System.out.println(name.indexOf("Java",20));

        int firstJavaLocation = name.indexOf("Java");// in this case it is 7
        int startingPointToSearchSecondJava = firstJavaLocation+1;
        // starting point can be right after the index of the first character of the word
        // you can start right after you finish the word you are searching, for the word of Java it is +4
        // if you don't know the length of the word you can use +word.length()
        int secondJavaLocation = name.indexOf("Java", startingPointToSearchSecondJava);

        System.out.println("secondJavaLocation = " + secondJavaLocation);
        System.out.println("Second Java Print = " + name.substring(secondJavaLocation,secondJavaLocation+4));

        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ",firstSpaceLocation+1);

        System.out.println("Second word in this sentence is "+name.substring(firstSpaceLocation+1,secondSpace));
    }
}
