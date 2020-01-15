package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {
        /*
         * create a long array or 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         *
         * OPTIONALLY : use different for each loop to
         * print only the salary more than 100000
         *
         * */

        long[] salaries = {85000L, 105000L, 75000L, 110000L, 100000L};

        for ( long eachSalary : salaries) {
            System.out.println("Salary = " + eachSalary);
        }
        System.out.println();
        for ( long eachSalary : salaries) {
            if(eachSalary>100000) {
                System.out.println("Each salary greater than 100k = " + eachSalary);
            }
        }

        // to find max salary value;
        long maxSalary = salaries[0];
        for (long eachSalary : salaries) {
            if (eachSalary>maxSalary){
                maxSalary=eachSalary;
            }
        }
        System.out.println("Maximum Salary = " + maxSalary);


    }
}
