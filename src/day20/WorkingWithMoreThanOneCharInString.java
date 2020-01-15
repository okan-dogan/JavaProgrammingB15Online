package day20;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {

        //

        String name = "Okan DOGAN";
        int nameLength = name.length();

        if (nameLength%2!=0){
            name+=" ";
        }
        for (int i = 0; i <nameLength ; i+=2) {

            System.out.println(name.substring(i,i+2));

        }

        for (int i = 0; i <nameLength-2 ; i++) {

            System.out.println(name.substring(i,i+3));

        }

    }
}
