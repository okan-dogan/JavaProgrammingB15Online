package Tests;

public class Test_Counting1to10And10to1 {

    public static void main(String[] args) {

        int count1 = 1;

        while (count1<=10){
            System.out.print(count1+" ");
            count1++; // as post increment has been used the count hold it's last increment for the future usage
        }
        System.out.println();
        System.out.println(count1); // post increment



        int count2 = 10;

        while (count2>=1){
            System.out.print(count2+" ");
            count2--; // as post increment has been used the count hold it's last increment for the future usage
        }
        System.out.println();
        System.out.println(count2); // post increment



        int count3 = 1;

        while (count3<=10){
            count3++; // as post increment has been used the count hold it's last increment for the future usage
            System.out.print(count3+" ");
        }
        System.out.println();
        System.out.println(count3); // post increment



        int count4 = 10;

        while (count4>=1){
            count4--; // as post increment has been used the count hold it's last increment for the future usage
            System.out.print(count4+" ");
        }
        System.out.println();
        System.out.println(count4); // post increment


    }

}
