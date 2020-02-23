package day50.task_Day50;

public class Subtraction extends Question{

    public Subtraction(int num1, int num2) {
        super("Subtraction Question ==> ", "-");
//        this.num1=num1;
//        this.num2=num2;
        // need to be sure num1 is more than num2

        if(num1<num2){
            int temp = num1;
            num1=num2;
            num2=temp;
        }
        // after making sure that num1 always greater than num2, we set the value to the field
        this.num1=num1;
        this.num2=num2;

    }

    @Override
    public void calculate() {
        answer=num1-num2;
        // if you come to this point it means you called
        // the calculate method to calculate the result
        calculated=true;
    }

    @Override
    public String toString() {

        // how do I call toString method of super class so i can generate
        // something like this :
        // // The question type is Subtraction :  10+90 =
        if (calculated == true) {
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return super.toString() + num1 + operator + num2 + " = ";
        }

    }
}
