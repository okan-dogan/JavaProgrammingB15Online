package repl_it;

import java.util.Scanner;

public class Repl_It_080_Build_A_Route_testSerdar {

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

        if (start.equalsIgnoreCase(end)) {
            System.out.println(end + " found");
        } else {
            String directions = "A right B down C left D up A right B down C";
            int indexStart = directions.indexOf(start);
            int indexEnd;

            if (start.charAt(0) < end.charAt(0)) {
                indexEnd = directions.indexOf(end);
            } else {
                indexEnd = directions.lastIndexOf(end); //will check backwards
            }

            String route = directions.substring(indexStart + 2, indexEnd - 1);
            route = route.replace('A', '>'); //will ignore if A is not present
            route = route.replace('B', '>');
            route = route.replace('C', '>');
            route = route.replace('D', '>');

            System.out.println(route + ": " + end + " found");
        }
    }
}
