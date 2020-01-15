package day30;
/*
You should use this format for input;
{"Superman-Clark Kent",
"Batman-Bruce Wayne",
"Wonder Woman-Princess Diana",
"Aquaman-Arthur Orin Curry",
"Wonder Woman-Princess Diana",
"Cyborg-Victor Stone",
"The Flash-Barry Allen",
"Green Lantern-Hal Jordan",
"Green Arrow-Oliver Queen",
"Atom-Ray Palmer",
"Hawkman-Carter Hall",
"Hawkgirl-Shiera Hall",
"Zantana-Zantana Zatara",
"Martian Manhunter-John Jones"}
 */
import java.util.Arrays;
import java.util.Scanner;

public class HeroesInitials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 Marvel Heroes ");

        String[] marvelHeroes = {scan.nextLine(), scan.nextLine(), scan.nextLine(),
                scan.nextLine(), scan.nextLine()};

        System.out.println("Marvel Heroes = " + Arrays.toString(marvelHeroes));

        for (String eachHero : marvelHeroes) {
            System.out.print("The hero is "+eachHero.substring(0,eachHero.indexOf("-"))+"  ===>  ");
            String[] herosSplit = eachHero.split("-");
            String[] herosName = herosSplit[1].split(" ");
            System.out.println("The Initials of the hero's real name is "+herosName[0].substring(0,1)+"."+herosName[herosName.length-1].substring(0,1)+".");
        }


    }
}
