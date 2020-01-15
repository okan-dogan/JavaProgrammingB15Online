package day11;

public class StringEquality {

    public static void main(String[] args) {

        String name = new String("Okan"); // using new keyword
        String name2 = "Okan"; // string literal
        String name3 = "Okan";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println(name==name2);
        System.out.println(name2==name3);
        System.out.println(name==name3);

        // The correct way of comparing String to get consistent result is
        // using one of the string object behaviour / method called
        // ewuals method
        // strl.equals(str2)

        System.out.println("USING EQUALS METHODS");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

        // DO NOT EVER USE == TO CHECK STRING EQUALITY


    }
}
