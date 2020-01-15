package Tests;

public class Test_GettingWords_120519 {

    public static void main(String[] args) {

        String movie = "Lord of the Ring";
        int firstSpaceLocation = movie.indexOf(" ");
        System.out.println("firstSpaceLocation = " + firstSpaceLocation);
        int secondSpaceLocation = movie.indexOf(" ",firstSpaceLocation+1);
        System.out.println("secondSpaceLocation = " + secondSpaceLocation);
        String secondWord = movie.substring(firstSpaceLocation+1, secondSpaceLocation);
        System.out.println("Second word of the movie = " + secondWord);
        int lastSpace = movie.lastIndexOf(" ",movie.length());
        System.out.println("lastSpace = " + lastSpace);
        String firstAndLastWord = movie.substring(0,firstSpaceLocation)+" and "
                                  +movie.substring(lastSpace+1,movie.length());
        System.out.println("firstAndLastWord = " + firstAndLastWord);


    }
}
