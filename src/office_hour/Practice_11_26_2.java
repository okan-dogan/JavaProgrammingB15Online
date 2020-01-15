package office_hour;

public class Practice_11_26_2 {

    public static void main(String[] args) {

        String season = "";

        season = "win";

        if (season.equalsIgnoreCase("spring")||season.equalsIgnoreCase("summer")||season.equalsIgnoreCase("fall")){
            System.out.println("Bears are active");

        }else if(season.equalsIgnoreCase("winter")){
            System.out.println("Bears are inactive");

        }else{
            System.out.println("There is no such that season");

        }





    }
}
