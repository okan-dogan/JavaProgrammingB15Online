package day22;

public class WarmUpTask_Multiplication_Table {

    public static void main(String[] args) {


        for (int i = 1; i <=12 ; i++) {
            System.out.println("Table For "+i);

            for (int j = 1; j <=12 ; j++) {
                System.out.print(i+" * "+j+" = ");
                System.out.println(i*j);
            }
        }
    }
}
