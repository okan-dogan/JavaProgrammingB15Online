package repl_it;

import java.util.Scanner;

public class Repl_It_080_Build_A_Route {

    public static void main(String[] args) {
//        Write a program that will print out route instructions.
//        Your program should take 2 parameters: start point and endpoint.
//        Use left, right, up and down for navigation.
//        Insert ">" between commands.
//        If start point equals to endpoint - display: "start/end(start or end variable!) found".
//        Note: you may move only clockwise.
//        Example:
//        Input: A
//        Input: D
//        Output: right > down > left: D found
//        Input: C
//        Input: C
//        Output: C found

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        // right > down > left: D found

        if(start.equals(end)){
            System.out.println(start+" found");
        }else if(start.startsWith("A")){
            if(end.endsWith("B")){
                System.out.println("right: B found");
            }else if(end.endsWith("C")){
                System.out.println("right > down: C found");
            }else if(end.endsWith("D")){
                System.out.println("right > down > left: D found");
            }
        }else if(start.startsWith("B")){
            if(end.endsWith("C")){
                System.out.println("down: C found");
            }else if(end.endsWith("D")){
                System.out.println("down > left: D found");
            }else if(end.endsWith("A")) {
                System.out.println("down > left > up: A found");
            }
        }else if(start.startsWith("C")){
            if(end.endsWith("D")){
                System.out.println("left: D found");
            }else if(end.endsWith("A")){
                System.out.println("left > up: A found");
            }else if(end.endsWith("B")) {
                System.out.println("left > up > right: B found");
            }
        }else if(start.startsWith("D")){
            if(end.endsWith("A")){
                System.out.println("up: A found");
            }else if(end.endsWith("B")){
                System.out.println("up > right: B found");
            }else if(end.endsWith("C")) {
                System.out.println("up > right > down: C found");
            }
        }




    }
}
