package day21;

public class LastHourCoolingTree_v2_Nested {

    public static void main(String[] args) {


        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //int counter = 10;

        for (int i = 10; i >=1 ; i--) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
