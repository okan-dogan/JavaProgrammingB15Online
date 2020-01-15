package day22;

public class StringArray {

    public static void main(String[] args) {

        String[] myName = new String[5];

        System.out.println(myName[0]); // default value of unassigned String Array is null

        myName[0]="Okan";
        myName[1]="Derya";
        myName[2]="Yusuf";
        myName[3]="Inci";
        myName[4]="Dogan";

        System.out.println(myName);

        System.out.println(myName[4]+" Family members' name are; "+myName[0]+" "+myName[1]+" "+myName[2]+" "+myName[3]);

    }
}
