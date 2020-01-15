package selfStudy;

public class Self03_PrimeNumbers_0to100 {

    public static void main(String[] args) {

        int counter = 0;
        int num = 100;

        for (int i = 4; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                if (i == j) {
                    continue;
                }
  //              System.out.println(i + "%" + j + "=" + i % j);
                if (i % j == 0) {
                    counter++;
                }
            }
  //          System.out.println(counter);
            if (counter == 0) {
  //              System.out.print("PRIME ");
                System.out.print(i+" ");
            } else {
  //              System.out.println("NOT PRIME " + i);
            }
            counter = 0;
  //          System.out.println(counter);
        }
    }
}








