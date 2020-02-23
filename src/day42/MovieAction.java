package day42;

public class MovieAction {

    public static void main(String[] args) {
        
        Movie m1 = new Movie();
        System.out.println("m1 = " + m1);
        
        Movie m2 = new Movie("Batman",2.13,"Action");
        System.out.println("m2 = " + m2);
        
        Movie m3 = new Movie("Pursuit of Happiness",2.0,"Drama");
        System.out.println("m3 = " + m3);
        
        Movie m4 = new Movie("Frozen2",1.5,"Family");
        System.out.println("m4 = " + m4);


        // I WANT TO GET THE name OF M2 SEPARATELY SO I CAN DO SOME STUFF
        // I can not access the field directly because it's private
        // i need a getter method to access
        // System.out.println(m2.name);
        System.out.println("m2.getName() = " + m2.getName());
        
        
        
    }
    
}
