package day19;

public class Test {

    public static void main(String[] args) {
        
        String str = "Hello";

        //length()
        int charCount = str.length();
        System.out.println("charCount = " + charCount);

        //charAt(index)
        char c1 = str.charAt(0);  // ---->> H
        char c5 = str.charAt(4);  // ---->> o
//        char c21 = str.charAt(20);  // ---->> gives error if you run it. There is no such that index
        System.out.println(c1+" "+c5);

        //lastIndexOf(anotherStr) / lastIndexOf(anotherStr , fromIndex)

        int index1 = str.lastIndexOf("l");
        System.out.println("index1 = " + index1);
        int index2 = str.lastIndexOf("az");
        System.out.println("index2 = " + index2);
        int index3 = str.lastIndexOf("l",2);
        System.out.println("index3 = " + index3);
        int index4 = str.lastIndexOf("l",3);
        System.out.println("index4 = " + index4);
        int index5 = str.lastIndexOf("l",4);
        System.out.println("index5 = " + index5);
        int index6 = str.lastIndexOf("l",1);
        System.out.println("index6 = " + index6);
        
        String name = "      Okan       ";
        String trimmedName = name.trim();
        System.out.println("trimmedName = " + trimmedName);

        String nameTest = "Okan";
        System.out.println("nameTest = " + nameTest);
        System.out.println(nameTest.toUpperCase());
        System.out.println(nameTest);
    }
}
