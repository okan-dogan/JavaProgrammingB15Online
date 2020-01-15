package day40;

public class SpaceShipCreationAkbar {

    public static void main(String[] args) {


        SpaceShipAkbar s1 = new SpaceShipAkbar();
        s1.name = "Orville";

        s1.setInitialPosition(1, 5);
//        // IF GIVEN WRONG DIRECTION , IT WILL NOT MOVE !!
//        s1.setDirection("ABC");
//        s1.move1Block();
//        System.out.println("s1 " + s1);
//        // IF GIVEN WRONG DIRECTION , IT WILL NOT MOVE !!
//        s1.setDirection("ABC");
//        s1.move1Block();
//        System.out.println("s1 " + s1);
//
//        s1.setDirection("down");
//        s1.move1Block();
//        System.out.println("s1 " + s1);
        s1.move1Block("up");
        s1.move1Block("right");
        s1.move1Block("up");
        s1.move1Block("down");
        s1.move1Block("HOME");

        System.out.println("s1 = " + s1);


    }

}
