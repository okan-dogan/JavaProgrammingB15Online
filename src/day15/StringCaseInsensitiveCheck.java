package day15;

public class StringCaseInsensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";
        System.out.println(name.contains("st"));
        String upperCaseName = name.toUpperCase();
        System.out.println("upperCaseName contains ST or not? "+upperCaseName.contains("ST"));
        String lowerCaseName = name.toLowerCase();
        System.out.println("lowerCaseName contains ST or not? "+lowerCaseName.contains("st"));
    }
}
