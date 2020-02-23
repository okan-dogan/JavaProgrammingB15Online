package day43;

import java.util.Arrays;
import java.util.List;

/*
Create another class called PetStore with main method
	Create 8 Pet objects with initial value
	Store them into a List<Pet>
	1, print out all info
	2, print out only name
	3, print out only cats
 */
public class PetStore {

    public static void main(String[] args) {


        Pet p1 = new Pet();
        System.out.println("p1 = " + p1);
        p1.speak();
        Pet p2 = new Pet("horse","Walter");
        Pet p3 = new Pet("cat","Samantha");
        Pet p4 = new Pet("dog","Oliver");
        Pet p5 = new Pet("dog","Henry");
        Pet p6 = new Pet("cow","Adam");
        Pet p7 = new Pet("ant","Atom");
        Pet p8 = new Pet("bear","Teddy");
        Pet p9 = new Pet("cat","Stephanie");

        List<Pet> myPets = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9);
        System.out.println("myPets = " + myPets);

        for (Pet eachPet : myPets) {
            System.out.println("eachPet.getNamePet() = " + eachPet.getNamePet());
        }
        System.out.println("=====EACH CAT=====");
        for (Pet eachPet : myPets) {
            if(eachPet.getTypePet().equalsIgnoreCase("CAT")){
                System.out.println("Each Cat in the list = " + eachPet.getNamePet());

            }
        }

    }
}
