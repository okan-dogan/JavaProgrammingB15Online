package day14;

public class PasswordValidator {

    public static void main(String[] args) {

        // minimum 8 char max 16 char
        // it must contain _ or $
        // it must not contain space
        // it must start with Ab
        // if any of above condition doesn't match say INVALID PASSWORD
        // else GOOD PASSWORD

        String password = "Ab_3oihhiua5";

        boolean min8max16 = password.length()>=8&&password.length()<=16;
        boolean contains_or$ = password.contains("_")||password.contains("$");
        boolean notContainSpace = !password.contains(" ");
        boolean startWithAb = password.startsWith("Ab");


        if (min8max16&&contains_or$&&notContainSpace&&startWithAb){
            System.out.println("GOOD PASSWORD");
        }else {
            System.out.println("INVALID PASSWORD");
        }

    }
}
