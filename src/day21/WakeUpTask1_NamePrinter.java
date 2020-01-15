package day21;

public class WakeUpTask1_NamePrinter {

    public static void main(String[] args) {

        String myName = "OkanDogan";
        int lastIndex = myName.length()-1;

        System.out.println("M->y->n->a->m->e is ");
        for (int i = 0; i <= lastIndex ; i++) {
            System.out.print(myName.charAt(i)+"->");
        }
        System.out.println();
        System.out.println("2 character: ");
        for (int i = 0; i <= lastIndex-1 ; i++) {
            System.out.print(myName.substring(i,i+2)+"->");
        }
        System.out.println();
        System.out.println("3 character: ");
        for (int i = 0; i <= lastIndex-2 ; i+=3) {
            System.out.print(myName.substring(i,i+3)+"->");
        }
        System.out.println();
        System.out.println("4 character: ");
        for (int i = 0; i <= lastIndex-3 ; i+=4) {
            System.out.print(myName.substring(i,i+4)+"->");
        }
    }
}
