package day40;
/*
Create a class called SpaceShip
it has 4 attributes :
	name as String
	currentDirection as String  | up , down , right, left
	xCordinate as int
	yCordinate as int
 few behaviours :
 	 setInitialPosition
 	 	accept 2 int parameters
 	 	to provide initial position of spaceship
 	 setDirection  void method
 	 	accept 1 String parameter to set the direction
 	 move1Block    void method
 	 	accept no parameter
 	 	and change the position according to the direction
 	 toString method
 	 	return String reperesntation of Spaceship Object
 */
public class SpaceShip {

    String nameShip, currentDirection; // EAST, WEST, NORTH, SOUTH
    int xCoordinate, yCoordinate;

    public void initialPos(int x, int y){
        xCoordinate=x;
        yCoordinate=y;
    }

    public void setDirection (String newDirection){
        if(     newDirection.equalsIgnoreCase("EAST")||
                newDirection.equalsIgnoreCase("WEST")||
                newDirection.equalsIgnoreCase("NORTH")||
                newDirection.equalsIgnoreCase("SOUTH")){
            currentDirection=newDirection;
//            move1Block();
        }else{
            System.out.println("Invalid Direction");
            currentDirection="";  // if you dont use this line
                                  // and write null into paranthesis
            // you get an exaption error
            //to eleminate this, you can assign empty String "" into currentLocation
        }

    }

    public void move1Block(){

        switch (currentDirection){
            case "EAST":
                xCoordinate++;
                break;
            case "WEST":
                xCoordinate--;
                break;
            case "NORTH":
                yCoordinate++;
                break;
            case "SOUTH":
                yCoordinate--;
                break;
        }
    }


    // oveerloaded move1Block
    // if you write valid String in paranthesis you use second method
    // if not you use first method
    public void move1Block(String newDirection){
        setDirection(newDirection);
        move1Block();
    }

    public String toString(){
        String curr = "";
        System.out.println("Your Space Ship "+nameShip+" is on; X = "+xCoordinate+", Y = "+yCoordinate);

        return curr;
    }


}
