package day19;

public class ForLoop_StarCase {

    public static void main(String[] args) {

        String star = "";
//        star = star+"* ";
//        System.out.println(star);
//        star = star+"* ";
//        System.out.println(star);
//        star = star+"* ";
//        System.out.println(star);
//        star = star+"* ";
//        System.out.println(star);

        for(int i=1;i<=10;i++){
            star += "* ";
            System.out.println(star);
        }

        for(int i=10;i>=1;i--){
            star = star.substring(0,star.lastIndexOf("*"));
            System.out.println(star);
        }
    }
}
