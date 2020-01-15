package day23;

public class Task_ArrayPractice {

    public static void main(String[] args) {

//        create an int array of 6 elements and find out
//        average of the array
//        sum of all elements
//        sum of even numbers in the array
//        sum of odd numbers in the array
//        max number in the array
//        min number in the array

        int[] arrayTask = new int[] {8,17,23,93,3,48};
        int sumAll=0;
        int averageArray=0;
        int sumEven=0;
        int sumOdd=0;
        int maxOfArray=arrayTask[0];
        int minOfArray=arrayTask[0];

        for (int i = 0; i <=arrayTask.length-1 ; i++) {
            sumAll+=arrayTask[i];
        }
        System.out.println("Sum of all the elements = "+sumAll);

        System.out.println("Average of the array = "+sumAll/arrayTask.length);

        for (int i = 0; i <=arrayTask.length-1 ; i++) {
            if(arrayTask[i]%2==0){
                sumEven+=arrayTask[i];
            }else{
                sumOdd+=arrayTask[i];
            }
        }
        System.out.println("Sum of even numbers in the Array = "+sumEven);
        System.out.println("Sum of odd numbers in the Array = "+sumOdd);

        for (int i = 0; i <=arrayTask.length-1 ; i++) {
            if(!(maxOfArray>arrayTask[i])){
                maxOfArray=arrayTask[i];
            }
        }
        System.out.println("Maximum number in the Array = "+maxOfArray);

        for (int i = 0; i <=arrayTask.length-1 ; i++) {
            if(!(minOfArray<arrayTask[i])){
                minOfArray=arrayTask[i];
            }
        }
        System.out.println("Minimum number in the Array = "+minOfArray);

    }
}
