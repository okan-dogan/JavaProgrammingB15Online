package day09;

public class InitializingAVariable {

    public static void main(String[] args) {

        int num1, num2, num3, num4;
        String bookName1, bookName2 ="";

        num1 = 13;
        num2 = 29;
        num3 = 52;
        num4 = 87;

        bookName1 = "The art of War";
        bookName2 = "Game Of Thrones";

        System.out.println(bookName1+" and "+bookName2+" are excellent books. Their total is just "+(num1+num2+num3+num4));
    }
}
