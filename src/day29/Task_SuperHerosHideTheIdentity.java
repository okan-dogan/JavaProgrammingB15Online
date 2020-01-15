package day29;
/*
hide last names with stars;
"Superman-Clark Kent",
"Batman-Bruce Wayne",
"Wonder Woman-Princess Diana",
"Aquaman-Arthur Orin Curry",
"Wonder Woman-Princess Diana",
"Cyborg-Victor Stone",
"The Flash-Barry Allen ",
"Green Lantern-Hal Jordan",
"Green Arrow-Oliver Queen",
"Atom-Ray Palmer",
"Hawkman-Carter Hall",
"Hawkgirl-Shiera Hall",
"Zantana-Zantana Zatara",
"Martian Manhunter-John Jones"}
 */

public class Task_SuperHerosHideTheIdentity {

    public static void main(String[] args) {

        String[] superHeros = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};


        for (int i = 0; i <superHeros.length ; i++) {
            String [] superSplit =superHeros[i].split("-");
            String hideHero="";
            for (int j = 0; j <superSplit[1].length() ; j++) {
                hideHero +="*";
            }
            System.out.println(superSplit[0]+" "+hideHero);
        }


    }
}
