package office_hour.ofice_hour_01132020;

public class PersonTesting {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAllValues("Okan","Dogan","10/02/1986");
        System.out.println(p1.toString());

        p1.printInfo();

    }
}
