package day49;

// CAN A CLASS BOTH EXTEND ANOTHER CLASS AND IMPLEMENT AN INTERFACE?
//
public class IceCream extends Object implements Edible {


    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
        i1.digest();

        // it prints the
        //     public default void digest() {
        //        System.out.println("YOU IMPLEMENT THE CODE YOURSELF !!");
        //    }
        // as it is not overridden in the Burger Class
        // it uses the inherited defoult method of Edible Interface
        Burger i2 = new Burger();
        i2.digest();

        // since Object class exists , we can create object out of it
        //Object o1 = new Object();

    }

    @Override
    public void digest() {
        System.out.println("Digesting burger by chewing more ");
    }

    @Override
    public void eat() {
        System.out.println("eat with spoon !!!!");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted in the cup");
    }


}