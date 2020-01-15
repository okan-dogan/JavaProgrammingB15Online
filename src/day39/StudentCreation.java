package day39;

public class StudentCreation {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Yusuf Halit";
        s1.age = 7;
        s1.gender = 'M';
        System.out.println("s1 name = "+s1.name);

        Student s2 = new Student();
        s2.name = "Inci";
        s2.age = 4;
        s2.gender = 'F';
        System.out.println("s2 age = "+s2.age);

        s2.age = 25;
        System.out.println(s2.age);


    }


}
