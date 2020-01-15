package day17;

public class NamePrinter_TaskReverse {

    public static void main(String[] args) {

        //             0123456789
        String name = "Okan Dogan";
        int counter = name.length()-1;

        while (counter>=0){
            System.out.print(name.charAt(counter)+"");
            --counter;
        }


//  it still works;
//        int counter = name.length();
//
//        while (counter!=0){
//            System.out.print(name.charAt(counter-1)+"");
//            --counter;
//        }


    }

}
