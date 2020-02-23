package day46;
// Programmer as super class
// JavaProgrammer   SQLProgrammer
// please override code and test under Sub classes

// JavaProgrammer
// unique behaviour : drinkCoffee , doRepl , doJavaDevelopment

// SQLProgrammer
// unique behaviour : writeSQLQuery , createDatabase()

// OVERRIDING IS UNIQUE FOR INSTANCE METHOD
// THERE IS NO CONCEPT OF OVERRIDING FOR ANYTHING OTHER THAN INSTANCE METHOD

public class Programmer {

    String msg1 = "Any Programmer Code", msg2 = "Any Programmer Test";
    void code(){
        System.out.println(msg1);
    }

    // is private method inherited ? NO!!
    // SO IT CAN NOT BE OVERRIDDIN
//     private void test(){
    void test(){
        System.out.println(msg2);
    }

}
