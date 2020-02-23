package day42;
/*
Add Setters to Movie Class
Create List<Movie> yourFavoriteMovieLst  add 10 Movie Objects
Print the name of the movies less than 2 hours
Print all the Action movies
If any Movie is longer than 2 hours Update the movie type to  Long(MovieType)
     for example : if type was Action -->> LongAction , Drama--> LongDrama
Find out longest Movie name
 */
public class Movie {

    private String name, type;
    private double length;

    public Movie(){
        System.out.println("EMPTY MOVIE");
    }

    // default constructor:
    // a constructor is given by compiler
    // only if you dont have any constructor in your Class
    // it is invisible
    // and it has no parameter
    // it has no code inside

    // Write a constructor to set all the fields value
    public Movie(String name, double length ,String type){
        this.name=name;
        this.length=length;
        this.type=type;

    }

    // only readable
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                '}';
    }
}
