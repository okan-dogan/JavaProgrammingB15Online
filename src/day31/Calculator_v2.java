package day31;

public class Calculator_v2 {

    public static void main(String[] args) {

//        char operator = '+'; // it can be + - *
//        int num1 = 15;
//        int num2 = 3;

        calculate('+',15,3);
        calculate('-',15,3);
        calculate('*',15,3);
        calculate('/',15,3);


    }

    public static void calculate(char operator, int num1, int num2){
        switch (operator){
            case '+':
                System.out.println("Addition result is "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction result is "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication result is "+(num1*num2));
                break;
            case '/':
                System.out.println("Division result is "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }


}
