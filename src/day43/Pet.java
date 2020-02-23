package day43;
/*
Pet
  attributes
		type
		name
  constructor :
  		no arg constructor
  			set the breed to "unknown"
  			set the name to "noname"
  		2 args constructor
  			set the name and breed to what the caller passed
 behaviours
 		getters , setters , toString
 		speak
 			accept no parameter
 			according to the type speak following
 				cat --> meow
 				dog --> woof
 				cow --> mooo
 				horse --> neinei
 */
public class Pet {

    String typePet, namePet;

    public Pet(){
        typePet="unknown";
        namePet="noname";
    }

    public Pet(String typePet, String namePet){
        this.typePet=typePet;
        this.namePet=namePet;
    }

    public void speak(){
        typePet.toUpperCase();
        switch (typePet){
            case "CAT":
                System.out.println("MEOW");
                break;
            case "DOG":
                System.out.println("WOOF");
                break;
            case "COW":
                System.out.println("MOOO");
                break;
            case "HORSE":
                System.out.println("NEINEI");
                break;
            default:
                System.out.println("UNKNOWN ANIMAL");
        }

    }

    public String getTypePet() {
        return typePet;
    }

    public void setTypePet(String typePet) {
        this.typePet = typePet;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "typePet='" + typePet + '\'' +
                ", namePet='" + namePet + '\'' +
                '}';
    }
}
