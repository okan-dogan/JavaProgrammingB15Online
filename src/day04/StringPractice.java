package day04;

public class StringPractice {

    public static void main(String[] args) {

    String firstName = "Okan";
    String lastName = "Dogan";
    String fullName = firstName + " " + lastName;
    String fullName2 = firstName + "\t" + lastName; // it puts 'tab'
    String fullName3 = firstName + "\n" + lastName; // it puts 'next line'

    System.out.println("My name is " + firstName + ", and my last name is "+ lastName+ ". So, my full name is "+fullName);

        System.out.println(fullName2);
        System.out.println(fullName3);




    }
}
