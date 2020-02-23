package office_hour.office_hour_01212020;

public class BOATeams {

    //static variable
    static String companyName;
    // if you use static variable you CANNOT change it by using an object like team1.companyName
    // you can only assign a value to the static variable by calling tha class name and then static variable name
    // i.e. BOATeams.companyName = "BOA" and then it is fixed in the class and its subclasses
    // each object created has the same company name of BOA
    // you can only implement objects to instance variables like team1.teamSize or team1.teamName etc.

    //information --> for teams
    //instance variables
    int teamSize;
    String teamType;
    String teamName;
    String projectName;
    int officeLocation;

    //actions
    public void Test() {
        System.out.println(teamName + " is having a meeting");
    }
}
