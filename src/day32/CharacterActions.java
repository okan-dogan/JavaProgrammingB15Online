package day32;

public class CharacterActions {

    public static void main(String[] args) {

        printAtoZ();
        printZtoA();
        alphabetInRange('O','Z');
        alphabetInRange('n','a');
        alphabetInRange('d','d');

    }

    /*
    printAtoZ
     */
    public static void printAtoZ(){
        for (char i = 'A'; i <='Z' ; i++) {
            if(i=='Z'){
                System.out.print(i);
            }else{
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }

    /*
printZtoA
 */
    public static void printZtoA(){
        for (char i = 'Z'; i >='A' ; i--) {
            if(i=='A'){
                System.out.print(i);
            }else{
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }

    public static void alphabetInRange(char beginningChar, char endingChar){
        if(beginningChar<endingChar){
            System.out.print("We will increment from "+beginningChar+" to "+endingChar+" ====>>>"+" ");
            for (char i = beginningChar; i <=endingChar ; i++) {
                System.out.print(i+", ");
            }
            System.out.println();
        }else if(beginningChar>endingChar){
            System.out.print("We will decrement from "+endingChar+" to "+beginningChar+" ====>>>"+" ");
            for (char j = beginningChar; j >=endingChar ; j--) {
                System.out.print(j+", ");
            }
            System.out.println();
        }else{
            System.out.println("Your Characters Are The Same!!!");
        }
    }


}
