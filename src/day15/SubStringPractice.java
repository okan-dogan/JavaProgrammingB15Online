package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        //getting the part of a String out of the another String
                    //  0123456789012345
        String movie = "Lord of The Ring";

        // I want to get the word "of" from this movie

        String wordOf = movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);
        //starting from beginning index until right before ending index 5 and 7

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        // get from the second word till last word

        int startingPoint = movie.indexOf(" ")+1;
        int endingPoint = movie.length();
        String movieSecondWord = movie.substring(startingPoint,endingPoint);

        System.out.println("movieSecondWord = " + movieSecondWord);

        // a better way to do this

        String secondToLast = movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);


        String lordOf = movie.substring(0,7);
        System.out.println("lordOf = " + lordOf);


    }
}
