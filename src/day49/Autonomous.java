package day49;
/*
Task 1:
	Create an Interface called Autonomous
		it has a single abstract method
			selfDrive()
	Create an abstract class called Vehicle
		it has 1 fields
			year
		add a constructor to set the field
		abstract method start() ;
		non-abstract instance method goForward
	Create a concrete class called Tesla
		 add instance field horsePower as int , model as String
	Tesla extends Vehicle and implements Autonomous
		add constructor to set all fields
		implement all abstract methods
		add toString methods
	create main method to test your code
OPTIONALLY : Create Chargable interface that have charge method
			 let Tesla implements Chargable
 */
public interface Autonomous {

    void selfDrive();

}