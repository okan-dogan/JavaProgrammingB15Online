package repl_it;

import java.util.Scanner;

public class Repl_It_080_Build_A_Route_testAikokul {

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

        String allPoints = "ABCD", stepsToGo = "", output = "";

        if((int) start.charAt(0) < (int) end.charAt(0))
            stepsToGo = allPoints.substring(allPoints.indexOf(start), allPoints.indexOf(end));
        else if((int) start.charAt(0) > (int) end.charAt(0))
            stepsToGo = allPoints.substring(allPoints.indexOf(start)) + "" + allPoints.substring(0, allPoints.indexOf(end));

        for (int i = 0; i < stepsToGo.length(); i++) {
            switch (stepsToGo.charAt(i)) {
                case 'A':
                    output += "right > ";
                    break;
                case 'B':
                    output += "down > ";
                    break;
                case 'C':
                    output += "left > ";
                    break;
                case 'D':
                    output += "up > ";
                    break;
            }
        }

        if(start.equalsIgnoreCase(end))
            System.out.println(start + " found");
        else
            System.out.println(output.substring(0, output.length() - 3) + ": " + end + " found");




    }
}
