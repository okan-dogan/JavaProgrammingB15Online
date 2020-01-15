package day23;

public class StringArrayPractice {

    public static void main(String[] args) {

        String[] shows = {"Orville", "Gifted", "Game of Throne", "Flash", "Arrow", "Super Girl"};
        int showsCount = shows.length;
        System.out.println("showsCount = " + showsCount);

        for (int i = 0; i <showsCount ; i++) {
            String currentShow = shows[i];
            System.out.println(currentShow + " has character count " + currentShow.length());

        }

    }
}
