package office_hour.office_hour_01212020;

public class Teams {
    public static void main(String[] args) {

        //since all the objects have the same company name
        //static way:
        //call the variable with the class name;
        BOATeams.companyName = "BOA";
        //     Classname.static field  ==> static way



        //create object
        //object
        BOATeams team1 = new BOATeams();
        team1.teamName = "Eagles";
        team1.teamSize = 9;
        team1.teamType = "UAT";
        //    team1.companyName = "BOA";


        //object
        BOATeams team2 = new BOATeams();
        team2.teamSize = 12;
        team2.teamName = "BugBusters";
        team2.teamType = "Scum Team";
        //   team2.companyName = "BOA";

        //object
        ScrumTeam team3 = new ScrumTeam();
        team3.teamName="Team-3";
        team3.standUp(); //scrumTeam class
        team3.teamSize = 10;   //BOATeams
        //    team3.companyName = "BOA";


        BOATeams team8 = new BOATeams();

        BOATeams team4 = new ScrumTeam();  // ???
        // team4.standUp(); it gives compile error
        // you can only see BOATeams parameter and methods
        // because of the Class name -->> BOATeams


        BOATeams team5 = new BOATeams();
        BOATeams team6 = new BOATeams();

        System.out.println(team8.teamSize); //0
        System.out.println(team3.teamSize); //10

        System.out.println("team 1: " + team1.companyName);//BOA
        System.out.println("team 8: " + team8.companyName);
        // static String companyName;
        // BOATeams.companyName = "BOA";


    }
}
