package day16;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        // in this case you cannot fail
        // just to learn how to use startsWith(), and endsWith()
        Scanner scan = new Scanner(System.in);

        System.out.println("Please just type what you are looking for!");
        String searchKeyword = scan.nextLine();
        String tabTitle = searchKeyword + "- Google Search";
        if (tabTitle.endsWith("- Google Search")&&tabTitle.endsWith("- Google Search")){
            System.out.println("Test has passed");

        }else {
            System.out.println("Test has failed");
        }
    }
}
