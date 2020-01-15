package day22;

public class ArrayIntro {

    public static void main(String[] args) {
        // create an byte array with size 4
        // and store it into a variable called data

        // assign value for each index location
        // print out the values at each index

        // update last index value
        // then print it out

        byte[] data = new byte[4];
        data[0]=10;
        data[1]=20;
        data[2]=30;
        data[3]=40;

        for (int i = 0; i <=3 ; i++) {
            System.out.println(data[i]);
        }
    }
}
