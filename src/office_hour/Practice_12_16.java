package office_hour;

public class Practice_12_16 {

    public static void main(String[] args) {

        String[] names = {"John", "Kevin", "Scott"};
        System.out.println("First name: " + names[0]);
        for (String name : names) {
            System.out.println(name);
        }
        //let's say we need to store some table
        //where we have rows and columns
        String[][] students = {
                {"1", "John", "35", "USA"},
                {"2", "Kevin", "40", "Brazil"},
                {"3", "Scott", "20", "Canada"}
        };
        //to format your code
        //click option + command + L
        System.out.println("How many arrays inside students 2d array? " + students.length);
        System.out.println("How many values in second row (inner array)? " + students[1].length);

        //loop through inner arrays
        for(String[] arr: students){
            //loop through values in every inner array
            for(String value: arr){
                System.out.print(value+" ");
            }
            System.out.println();
        }

        // 1st Get only age values
        for(String[] row: students){
            //go through every row and get
            //value only from 3rd column | number -1 = index
            System.out.println(row[2]);//3rd row represents age
            //I need to convert into integer to be able to compare
            int age = Integer.parseInt(row[2]);//convert string --> into int
        }

    }
}
