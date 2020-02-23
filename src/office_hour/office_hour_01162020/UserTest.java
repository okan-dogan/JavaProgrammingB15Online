package office_hour.office_hour_01162020;

public class UserTest {

    int a;
    public static void main(String[] args) {
        // ClassName       ReferenecName = new ExistingConstructor
        UserTest t = new UserTest();

        System.out.println(t.a);

        UserInfo Alisa = new UserInfo(); // to call the instance of the class
        //Alisa.userName = "Alisa";
        // System.out.println(Alisa.userName); private is not accessible outside class

        Alisa.setUserName("Alisa");
        Alisa.getUserName();
        System.out.println(Alisa.getUserName());

        Alisa.setSsn("123456");
        System.out.println(Alisa.getSsn());

        UserInfo Kamran = new UserInfo();
        System.out.println(Kamran.getUserName());
        System.out.println(Kamran.getPassWord());
        System.out.println(Kamran.getSsn());

        UserInfo Okan = new UserInfo("Okan","Pas123123","115599775533");
        System.out.println(Okan.getUserName());
        System.out.println(Okan.getPassWord());
        System.out.println(Okan.getSsn());


    }


}
