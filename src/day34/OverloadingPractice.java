package day34;
/*
Create a class called OverloadingPractice
create 4 static void overloaded version of add method
	1, add
		has 1 int parameter and add 100 to that number
		and print out the result
	2, add
		has 2 int parameters and add them to get sum
		and print out the result
	3, add
		has 3 int parameters and add them to get sum
		and print out the result
	4, add
		has 2 long parameters and add them to get sum
		and print out the result
 */
public class OverloadingPractice {

    public static void main(String[] args) {

        add(5);
        add(5,5);
        add(5,5,5);
        add(5L,5L);


    }

    public static void add(int x){
        System.out.println(x+100);
    }
    public static void add(int x, int y){
        System.out.println(x+y);
    }
    public static void add(int x, int y, int z){
        System.out.println(x+y+z);
    }
    public static void add(long x, long y){
        System.out.println(x+y);
    }


}
