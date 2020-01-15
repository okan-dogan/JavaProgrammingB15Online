package office_hour;

import java.util.Arrays;

/*
1. write a method that can convert km to miles
	 				Hint: 1 km = 0.612 miles
	 	2. write a method that can convert gallons to litters
	 			   Hint: 1 G = 3.75 L
	 	3. write a method that can print out the array in Descending order
	 	4. write a method that accepts 3 parameters: 2 numbers and one operator,
	 	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
			Ex: calculate(10, 2, "*") ==> 20;
				calculate(20, 2, "~") ==> invalid operator
		5. write a method that can calculate grade
					if score is 100 ~ 90 ==> A
					if score is 89 ~ 80 ==> B
					if score is 79 ~ 70 ==> C
					if score is 69 ~ 60 ==> D
					if score is 0 ~ 59 ==> F
					otherwise ==> Invalid Score
 */
public class Practice_12_27_WarmUp {

    public static void main(String[] args) {



        System.out.println("======KMtoMILE====");
        System.out.println(convertKMtoMILE(15));
        System.out.println(convertKMtoMILE(3.5));


        System.out.println("======GtoL====");
        System.out.println(convertGtoL(16.5));
        System.out.println(convertGtoL(4));

        System.out.println("======DESC ARRAY====");
        int[]arr={5,6,10,2};
        descOrder(arr);

        System.out.println("======CALCULATE OPS====");
        calculateOps(20,10,'+');
        calculateOps(20,10,'!');


//
//        System.out.println("======Calculator====");
//
//        ;
//
//
//        System.out.println("======scoreCalculator====");
//
//        scoreCalculator(120);
//        scoreCalculator(95);
//        scoreCalculator(75);
//        scoreCalculator(50);
//        scoreCalculator(-10);



    }

//    public static void convertKMtoMILE(double kms){
//        double miles = 0;
//        miles= kms*0.612;
//        System.out.println(miles);
//    }
    public static double convertKMtoMILE(double kms){
        double miles = kms*0.612;
        return miles;
    }

//    public static void convertGtoL(double Gs){
//        double liter = 0;
//        liter= Gs*3.75;
//        System.out.println(liter);
//    }

    public static double convertGtoL(double Gs){
        double liter = Gs*3.75;
        return liter;
    }

    public static void descOrder(int[] array){
        Arrays.sort(array);
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void calculateOps(int num1, int num2, char op) {
        if (!(op == '-' || op == '+' || op == '*' || op == '/' || op == '%')) {
            System.out.println("Invalid Operator");
        }else if(op == '-'){
            System.out.println(num1-num2);
        }else if(op == '+'){
            System.out.println(num1+num2);
        }else if(op == '*'){
            System.out.println(num1*num2);
        }else if(op == '/'){
            System.out.println(num1/num2);
        }else if(op == '%'){
            System.out.println(num1%num2);
        }
    }

//    public static void scoreCalculator(int score){
//        String scoreChar="";
//        if(score>100||score<0){
//            scoreChar="Invalid Score";
//        }else if(score<=100&&score>=90){
//            scoreChar="A";
//        }else if(score<=89&&score>=80){
//            scoreChar="B";
//        }else if(score<=79&&score>=70){
//            scoreChar="C";
//        }else if(score<=69&&score>=60){
//            scoreChar="D";
//        }else if(score<=59&&score>=0){
//            scoreChar="F";
//        }
//        System.out.println(scoreChar);
//    }

    public static String scoreCalculator(int score){
        String scoreChar="";
        if(score>100&&score<0){
            scoreChar="Invalid Score";
        }else if(score<=100&&score>=90){
            scoreChar="A";
        }else if(score<=89&&score>=80){
            scoreChar="B";
        }else if(score<=79&&score>=70){
            scoreChar="C";
        }else if(score<=69&&score>=60){
            scoreChar="D";
        }else if(score<=59&&score>=0){
            scoreChar="F";
        }
        return scoreChar;
    }



}
