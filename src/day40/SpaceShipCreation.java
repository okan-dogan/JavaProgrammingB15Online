package day40;

public class SpaceShipCreation {

    public static void main(String[] args) {

        SpaceShip ss1 = new SpaceShip();
        SpaceShip ss2 = new SpaceShip();

        ss1.nameShip="Barbaros";
        ss1.xCoordinate=5;
        ss1.yCoordinate=4;

        ss1.toString();

        ss1.setDirection("east");
        ss1.setDirection("north");

        ss1.toString();

        ss1.setDirection("south");
        ss1.setDirection("west");

        ss1.toString();

        ss1.initialPos(100,105);
        ss1.toString();

        ss1.setDirection("okan");
        ss1.setDirection("");
        //ss1.setDirection(null); //** see description in class

        ss1.move1Block("SOUTH");
        ss1.toString();


    }





}
