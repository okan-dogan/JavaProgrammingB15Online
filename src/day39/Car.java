package day39;
/*
Create a Car Object template by creating a Car class
	it  has these attributes
		year , model , make , color
Create few object out of it with field value set
 */
public class Car {

    int modelYear;
    String modelName;
    String producer;
    String color;

    public void goForward(){
        System.out.println(modelName+ "Going forward");
    }

    // Create a method to print how old is this car
    public void printCarAge(){
        System.out.println("Car age is = "+(2020-modelYear));
    }


        // create a method to change the color
        // Write bunch of code here to validate
        // user is actually passing correct color
        // for example  Red , Blue is valid color
        //              ABC , EFG is not valid color
    public void changeColorTo(String newColor){
        color=newColor;
    }

    // instance methods are tied to the object
    // it does not have have static keyword
    // we need an object when we call them

}
