package day15;

public class NameChecker {

    public static void main(String[] args) {

        String myName = "Okan";
        int myNameLength = myName.length();

        if (myNameLength<=4){
            System.out.println("SHORT NAME");
        } else if (myNameLength<11&&myNameLength>4){
            System.out.println("MEDIUM NAME");
        } else if(myNameLength>=11){
            System.out.println("LONG NAME");
        }
        if (myName.contains("a")||myName.contains("e")){
            System.out.println("MY NAME CONTAINS A OR E");
        }else{
            System.out.println("MY NAME DOESN'T HAVE A OR E");
        }
    }
}
