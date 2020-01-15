package day17;

public class NamePrinter_WhileLoop {

    public static void main(String[] args) {

        String name = "Okan";
        int counter = 0;
        while (counter<name.length()){
            System.out.println(name.charAt(counter));
            ++counter;
        }



    }
}
